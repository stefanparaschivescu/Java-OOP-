package exercise.Stefan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean duplexPrinter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the level of the toner: ");
        int tonerLevel = scanner.nextInt();
        if (tonerLevel >= 100)
        {
            System.out.println("You can't add a value bigger than 100. Your value was corrected to 100 % (full) ");
            System.out.println();
        }
        System.out.println("Please introduce the number of sheets that are already in the printer: ");
        int numberOfSheets = scanner.nextInt();

        System.out.println("Is your printer a duplex? ");
        String text = scanner.next();
        System.out.println();

        text.toLowerCase();
        if (text.compareTo("yes") == 1)
            duplexPrinter = true;
        else
            duplexPrinter = false;

        Printer printer = new Printer(tonerLevel,numberOfSheets, duplexPrinter);

        System.out.println("Please introduce how much ink do you want to add in the printer:");
        printer.fillToner(scanner.nextInt());

        System.out.println("How many pages do you want to print? ");
        printer.printPage(scanner.nextInt());


    }
}
