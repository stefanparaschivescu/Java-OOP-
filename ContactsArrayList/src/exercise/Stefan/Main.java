package exercise.Stefan;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0734809068");

    public static void main(String[] args) {

	    boolean quit = true;
	    int choice = 0;

        while (!quit) {
            switch (choice) {
                case 0:
                    printInstructions();
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = false;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To update a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search/find for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addItem() {
        System.out.print("Introduce a new contact: Name -> ");
        String name = scan.nextLine();
        System.out.print("Phone number -> ");
        String phoneNumber = scan.nextLine();
        Contacts contact = Contacts.createContact(name, phoneNumber);
        mobilePhone.addNewContact(contact);
    }

    private static void updateContact() {
        System.out.print("Introduce the contact name you want to update: ");
        String name = scan.nextLine();
        if (mobilePhone.findContact(name) >= 0) {
            System.out.print("Intrudece the new name: ");
            String newName = scan.nextLine();
            System.out.print("Introduce the new number: ");
            String newNumber = scan.nextLine();
            Contacts contact = Contacts.createContact(newName, newNumber);
            mobilePhone.modifyContact(mobilePhone.getContact(name), contact);
        }
        else
            System.out.println("The contact you have introduced deos not exist.");
    }

    private static void removeContact() {
        System.out.print("Introduce the contact name you want to remove: ");
        String name = scan.nextLine();
        if (mobilePhone.findContact(name) >= 0)
            mobilePhone.removeContact(mobilePhone.getContact(name));
        else
            System.out.println("The contact you have introduced deos not exist.");
    }

    private static void searchContact() {
        System.out.print("Introduce the contact name you want to remove: ");
        String name = scan.nextLine();
        if (mobilePhone.findContact(name) >= 0)
            System.out.println(name + " is in the contact list.");
        else
            System.out.println(name + " was not found in the contact list");
    }
}
