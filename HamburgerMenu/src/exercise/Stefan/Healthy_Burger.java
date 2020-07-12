package exercise.Stefan;

public class Healthy_Burger extends Base_Hamburger{

    private double[] priceOfAdditionals = new double[2];
    private String[] additionals = new String[2];
    private double finalPrice = 0;
    private int numberOfAdditions = 0;

    public Healthy_Burger(String meat, int basePrice) {
        super("Brown", meat, basePrice, "Healthy Burger");
    }

    public void addAddition () {
        if (super.getNumberOfAdditions() < 4)
            super.addAddition();
        else if (numberOfAdditions < 2) {
            System.out.println("Please insert the additions you want.");
            additionals[numberOfAdditions] = keyboard.next();
            numberOfAdditions++;
        }
        else
            System.out.println("Your limit of adding additions has been exceeded.");
    }

    @Override
    public double getTotalPrice () {
        for (int i=0; i<priceOfAdditionals.length; i++)
            finalPrice += priceOfAdditionals[i];
        return finalPrice;
    }

    private void convertPrice () {
        priceOfAdditionals = super.calculatePriceOfAddition(additionals);
        finalPrice += getTotalPrice();
        finalPrice += super.getTotalPrice();
    }

    public void showReceipt() {
        super.setPriceOfAdditionals(calculatePriceOfAddition(super.getAdditionals()));
        convertPrice();
        System.out.println(super.getName() + " with a price of " + super.getBasePrice());
        for (int i=0; i<super.getNumberOfAdditions(); i++)
            System.out.println("Addition #" + (i+1) + " is " + getAddition(i) + " with a price of " + getPriceOfAddition(i));
        for (int i=0; i<this.numberOfAdditions; i++)
            System.out.println("Addition #" + (i+5) + " is " + this.additionals[i] + " with a price of " + this.priceOfAdditionals[i]);
        System.out.println("The final price is: " + this.finalPrice + "\n");
    }
}
