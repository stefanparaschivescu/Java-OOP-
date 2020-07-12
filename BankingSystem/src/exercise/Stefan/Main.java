package exercise.Stefan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SavingsAccount contEconomii = new SavingsAccount(10000, "13", "Stefan Paraschivescu", "0734809069", "Bucuresti", "500421024", 2);
        CurrentAccount contPrincipal = new CurrentAccount(1200,"12", "Stefan Paraschivescu", "0734809069", "Bucuresti", "500421024", 100);

        contEconomii.deposit(2000);
        contEconomii.adaugareDobanda();

        contPrincipal.withdraw (1000);
        contPrincipal.deposit (100);
        contPrincipal.withdraw (4000);
    }
}
