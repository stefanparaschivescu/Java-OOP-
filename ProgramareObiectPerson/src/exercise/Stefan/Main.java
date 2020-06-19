package exercise.Stefan;

public class Main {

    public static void main(String[] args) {
	// write your code here
    BankAccount bankAccount = new BankAccount();
    bankAccount.setBalance(2000);
        System.out.println("Your balance is: " + bankAccount.getBalance());
    bankAccount.deposit(1000);
    bankAccount.withdrawal(2000);
    bankAccount.setBalance(0);
        System.out.println("Your balance is: " + bankAccount.getBalance());
        bankAccount.withdrawal(2000);
        bankAccount.deposit(1000);
        bankAccount.withdrawal(2000);





    }
}
