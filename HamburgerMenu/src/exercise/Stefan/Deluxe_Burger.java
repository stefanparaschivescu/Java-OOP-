package exercise.Stefan;

public class Deluxe_Burger extends Base_Hamburger {

    private double priceOfAdditionals [] = {1.99,0.99};
    private String additionals [] = {"Chips", "Drink"};
    private double finalPrice;

    public Deluxe_Burger(String breadRollType, String meat, double basePrice) {
        super(breadRollType, meat, basePrice, "Deluxe Burger");
    }

    public void addAddition () {
        System.out.println("Your Deluxe Burger can't have any addition");
    }

    private void getFinalPriceOfDeluxe () {
        for (int i=0; i<this.priceOfAdditionals.length; i++)
            finalPrice += priceOfAdditionals[i];
        finalPrice += super.getBasePrice();
    }

    public void showReceipt() {
        System.out.println(super.getName() + " with a price of " + super.getBasePrice());
        for (int i=0; i<this.priceOfAdditionals.length; i++)
            System.out.println("Addition #" + (i+1) + " is " + this.additionals[i] + " with a price of " + this.priceOfAdditionals[i]);
        getFinalPriceOfDeluxe();
        System.out.println("The final price is: " + finalPrice + "\n");
    }

}
