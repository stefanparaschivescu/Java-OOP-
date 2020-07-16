package exercise.Stefan;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contactList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {
        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public boolean removeContact (Contacts contact) {
        if (findContact(contact.getName()) < 0) {
            System.out.println(contact.getName() + "does not exist");
            return false;
        }
        contactList.remove(contact);
        return true;
    }

    public boolean modifyContact (Contacts oldContact, Contacts newContact) {
        if (findContact(oldContact.getName()) < 0) {
            System.out.println(oldContact.getName() + " does not exist");
            return false;
        }
        else if (findContact(newContact.getName()) >= 0) {
            System.out.println(newContact.getName() + " does already exists");
            return false;
        } else {
            contactList.set(contactList.indexOf(oldContact), newContact);
            System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
            return true;
        }
    }

    private int findContact (Contacts contact) {
        return contactList.indexOf(contact);
    }

    public int findContact (String name) {
        for (int i=0; i<contactList.size(); i++) {
            Contacts contact = this.contactList.get(i);
            if (contact.getName().equals(name))
                return i;
        }
        return -1;
    }

    public Contacts getContact (String name) {
        return contactList.get(findContact(name));
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.contactList.size(); i++) {
            System.out.println((i+1) + "." +
                    this.contactList.get(i).getName() + " -> " +
                    this.contactList.get(i).getPhoneNumber());
        }

    }
}
