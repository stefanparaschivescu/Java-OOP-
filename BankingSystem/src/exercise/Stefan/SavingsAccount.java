package exercise.Stefan;

public class SavingsAccount extends Account {

    private int dobanda; //in procente

    public SavingsAccount(int sold, String ID, String numeClient, String numarTelefon, String adresa, String CNP, int dobanda) {
        super(sold, ID, numeClient, numarTelefon, adresa, CNP);
        this.dobanda = dobanda;
    }

    @Override
    public double getSold() {
        return super.getSold();
    }

    public void adaugareDobanda ()
    {
        System.out.println("Soldul dumneavoastra dupa adaugarea dobanzii este " + getSold() + (dobanda/100 * getSold()));
        System.out.println("Dobanda primita este " + dobanda);
        System.out.println();
    }

    @Override
    public void deposit(double sumaDepozitata) {
        super.deposit(sumaDepozitata);
    }

    @Override
    public void withdraw(double sumaScoasa) {
        super.withdraw(sumaScoasa);
    }
}
