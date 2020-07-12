package exercise.Stefan;

public class Main {

    public static void main(String[] args) {
        Base_Hamburger hamburger = new Base_Hamburger("White", "Cow", 3, "Base Hamburger");
        Healthy_Burger healthy = new Healthy_Burger("Cow", 4);
        Deluxe_Burger deluxe = new Deluxe_Burger("White", "Cow", 5);

        hamburger.addAddition();
        hamburger.addAddition();
        hamburger.addAddition();
        hamburger.addAddition();
        hamburger.addAddition();
        hamburger.showReceipt();

        healthy.addAddition();
        healthy.addAddition();
        healthy.addAddition();
        healthy.addAddition();
        healthy.addAddition();
        healthy.addAddition();
        healthy.addAddition();
        healthy.showReceipt();

        deluxe.addAddition();
        deluxe.showReceipt();
    }
}
