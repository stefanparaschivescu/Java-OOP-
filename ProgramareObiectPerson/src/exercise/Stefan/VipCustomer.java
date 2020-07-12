package exercise.Stefan;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAdress;

    public VipCustomer (){
        this("Default name", 100, "Default email adress");
        System.out.println("The default constructor have been called");}

        public VipCustomer (String name, int creditLimit)
        {   this (name, creditLimit, "Defalt email adress");
            this.creditLimit = creditLimit;
            this.name = name;
        }

        public VipCustomer (String name, int creditLimit, String emailAdress)
        {
            this.name = name;
            this.creditLimit = creditLimit;
            this.emailAdress = emailAdress;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
