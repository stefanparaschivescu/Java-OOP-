package exercise.Stefan;

public class Account {
    private double sold;
    private String ID;
    private String numeClient;
    private String numarTelefon;
    private String adresa;
    private String CNP;

    public Account(int sold, String ID, String numeClient, String numarTelefon, String adresa, String CNP) {
        this.sold = sold;
        this.ID = ID;
        this.numeClient = numeClient;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
        this.CNP = CNP;
    }

    public double getSold() {
        return sold;
    }

    public void deposit (double sumaDepozitata)
    {
        this.sold = this.sold + sumaDepozitata;
        System.out.println("Suma depozitata este " + sumaDepozitata);
        System.out.println("Soldul dumneavoastra este " + sold);
        System.out.println();
    }

    public void withdraw (double sumaScoasa)
    {
        this.sold = this.sold - sumaScoasa;
        System.out.println("Suma depozitata este " + sumaScoasa);
        System.out.println("Soldul dumneavoastra este " + sold);
        System.out.println();
    }

}
