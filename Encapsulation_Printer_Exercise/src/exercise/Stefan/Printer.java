package exercise.Stefan;

public class Printer {
    private int tonerLevel;
    private int numberOfSheets;
    private boolean duplexPrinter;


    public Printer(int tonerLevel, int numberOfSheets, boolean duplexPrinter) {
        if (tonerLevel < 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = 100;
        this.numberOfSheets = numberOfSheets;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner (int ink)
    {
        if (this.tonerLevel + ink < 100) {
            this.tonerLevel = this.tonerLevel + ink;
            System.out.println("The toner level is at " + this.tonerLevel + "%");
        }
        else {
            int remaining = ink - (100 - this.tonerLevel) ;
            this.tonerLevel = 100;
            System.out.println("Remaining ink is " + remaining + "%");
        }
    }

    public void printPage (int printedPages)
    {   if (tonerLevel > 0) {
        if (duplexPrinter == true) {
            for (int i = 1; i <= printedPages; i = i + 2)
                numberOfSheets++;
            if (printedPages % 2 == 0)
                numberOfSheets++;
        } else
            for (int i = 1; i <= printedPages; i++)
                numberOfSheets++;

        System.out.println("The number of sheets that have been printed is " + numberOfSheets);
    }
    else
        System.out.println("You don't have enough ink");
    }



}

