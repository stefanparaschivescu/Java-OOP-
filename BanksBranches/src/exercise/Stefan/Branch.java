package exercise.Stefan;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer (String customerName, double initialTransactions) {
        Customer checkedCustomer = new Customer(customerName, initialTransactions);
        if (findCustomer(customerName) != null) {
            customers.add(checkedCustomer);
            return true;
        }
        return false;
    }

    public boolean addAdditionalTransaction (String customerName, double newTransaction) {
        if (findCustomer(customerName) != null) {
            findCustomer(customerName).addTransaction(newTransaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer (String customerName) {
        for (int i=0; i<customers.size(); i++)
            if (customers.get(i).getName().equals(customerName))
                return customers.get(i);
            return null;
    }
}
