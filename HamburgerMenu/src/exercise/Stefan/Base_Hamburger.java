package exercise.Stefan;

import java.util.Scanner;

public class Base_Hamburger {

    Scanner keyboard = new Scanner(System.in);

    private String breadRollType;
    private String meat;
    private double finalPrice = 0;
    private double basePrice;
    private double[] priceOfAdditionals = new double[4];
    private String name;
    private String[] additionals = new String[4];
    private int numberOfAdditions = 0;

    public Base_Hamburger(String breadRollType, String meat, double basePrice, String name) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public double getPriceOfAddition(int i) {
        return priceOfAdditionals[i];
    }

    public String[] getAdditionals() {
        return additionals;
    }

    public String getAddition(int i) {
        return additionals[i];
    }

    public int getNumberOfAdditions() {
        return numberOfAdditions;
    }

    public void setPriceOfAdditionals(double[] priceOfAdditionals) {
        this.priceOfAdditionals = priceOfAdditionals;
    }

    public void setNumberOfAdditions(int numberOfAdditions) {
        this.numberOfAdditions = numberOfAdditions;
    }

    public void setAdditionals(String[] additionals) {
        this.additionals = additionals;
    }

    public void setAddition(String addition) {
        this.additionals[numberOfAdditions] = addition;
    }

    public void addAddition () {
        if (numberOfAdditions < 4) {
            System.out.println("Please insert the additions you want.");
            this.additionals[numberOfAdditions] = keyboard.next();
            this.numberOfAdditions++;
        }
        else
            System.out.println("Your limit of adding additions has been exceeded.");
    }

    double[] calculatePriceOfAddition(String[] additions) {
        double[] priceOfAdditions = new double[4];
        for (int i=0; i<additions.length; i++)
            switch (additions[i]) {
                case "Tomato": priceOfAdditions[i] = 1.99; break;
                case "Letuce": priceOfAdditions[i] = 2.39; break;
                case "Carrot": priceOfAdditions[i] = 1.49; break;
                case "Onion": priceOfAdditions[i] = 2.49; break;
                case "Cucumber": priceOfAdditions[i] = 0.99; break;
                case "Iceberg Salad": priceOfAdditions[i] = 0.79; break;
            }
        return priceOfAdditions;
    }

    public double getTotalPrice () {
        for (int i=0; i<this.priceOfAdditionals.length; i++)
            this.finalPrice += this.priceOfAdditionals[i];
        return this.finalPrice;
    }

    public void showReceipt () {
        this.priceOfAdditionals = calculatePriceOfAddition(additionals);
        System.out.println(this.name + " with a price of " + this.basePrice);
        for (int i=0; i<this.priceOfAdditionals.length; i++)
            System.out.println("Addition #" + (i+1) + " is " + this.additionals[i] + " with a price of " + getPriceOfAddition(i));
        System.out.println("The final price is: " + getTotalPrice() + "\n");
    }
}
