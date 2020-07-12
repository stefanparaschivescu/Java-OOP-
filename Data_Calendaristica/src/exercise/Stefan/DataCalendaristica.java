package exercise.Stefan;

public class DataCalendaristica {
    private int ziua;
    private int luna;
    private int an;

    public DataCalendaristica(int ziua, int luna, int an) {
        this.ziua = ziua;
        this.luna = luna;
        this.an = an;
    }

    public String afisareData ()
    {
        return ziua + " / " + luna + " / " + an;
    }
}
