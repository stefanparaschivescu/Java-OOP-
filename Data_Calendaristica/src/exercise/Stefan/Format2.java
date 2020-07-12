package exercise.Stefan;


public class Format2 {

    private DataCalendaristica ziua;
    private DataCalendaristica luna;
    private DataCalendaristica an;

    public String transformareNumar(int luna) {

        switch (luna) {
            case 1:
                return "Ianuarie";
            case 2:
                return "Februarie";
            case 3:
                return "Martie";
            case 4:
                return "Aprilie";
            case 5:
                return "Mai";
            case 6:
                return "Iunie";
            case 7:
                return "Iulie";
            case 8:
                return "August";
            case 9:
                return "Septembrie";
            case 10:
                return "Octombrie";
            case 11:
                return "Noiembrie";
            case 12:
                return "Decembrie";
            default:
                return "Nu ati introdus un numar cuprins intre 1-12";
        }
    }

    public String afisareData ()
    {
        return ziua + " / " + transformareNumar(luna) + " / " + an;
    }

}
