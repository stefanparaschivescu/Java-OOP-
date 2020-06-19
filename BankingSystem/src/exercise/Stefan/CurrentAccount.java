package exercise.Stefan;

public class CurrentAccount extends Account {

    private int limita;

    public CurrentAccount(int sold, String ID, String numeClient, String numarTelefon, String adresa, String CNP, int limita) {
        super(sold, ID, numeClient, numarTelefon, adresa, CNP);
        this.limita = limita;
    }

    @Override
    public void deposit(double sumaDepozitata) {
        super.deposit(sumaDepozitata);
    }

    @Override
    public void withdraw(double sumaScoasa) {

        if (-(getSold() - sumaScoasa) < limita)
        super.withdraw(sumaScoasa);
        else
            System.out.println("Limita a fost atinsa");
    }
}
