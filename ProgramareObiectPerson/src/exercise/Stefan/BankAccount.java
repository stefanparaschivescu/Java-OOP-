package exercise.Stefan;

public class BankAccount {
    private int accountNumber, balance;
    private String customerName, email, phoneNumber;

    public int getAccountNumber ()
    {
        return accountNumber;
    }
    public int getBalance ()
    {
        return balance;
    }
    public String getCustomerName ()
    {
        return customerName;
    }
    public String getEmail ()
    {
        return email;
    }
    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setAccountNumber (int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void setBalance (int balance)
    {
        this.balance = balance;
    }
    public void setCustomerName (String customerName)
    {
        this.customerName = customerName;
    }
    public void setEmail (String email)
    {
        this.email = email;
    }
    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void deposit (int moneyDeposited)
    {
        balance = balance + moneyDeposited;
        System.out.println("You have deposited: " + moneyDeposited);
        System.out.println("Your account balance is: " + balance);
    }
    public void withdrawal (int moneyWithdrawed)
    {
        if (balance == 0)
            System.out.println("Insufficient funds, your account balance is 0");
        else
            if (moneyWithdrawed > balance) {
                System.out.print("Insufficient fund. You tried to withdraw:" + moneyWithdrawed +" ,but your account balance is: " + balance + "* * *");
                System.out.println("You can't withdraw more than " + balance);
            }
        else
        {balance = balance - moneyWithdrawed;
        System.out.println("Yout withdrawed " + moneyWithdrawed + "." + " Your new account balance is: " + balance);
    }   }
}
