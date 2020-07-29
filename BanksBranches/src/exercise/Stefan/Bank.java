package exercise.Stefan;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch (String branchName) {
        Branch newBranch = new Branch(branchName);
        if (findBranch(branchName) != null)
        {
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer (String customerName, String branchName, double initialTransactions) {
        Branch checkedBranch = new Branch(branchName);
        if (findBranch(branchName) != null) {
            checkedBranch.addNewCustomer(customerName, initialTransactions);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction (String customerName, String branchName, double transactionAmount) {
        Branch checkedBranch = new Branch(branchName);
        if (findBranch(branchName) != null) {
            checkedBranch.addAdditionalTransaction(customerName, transactionAmount);
            return true;
        }
        return false;
    }

    public boolean listCustomers (String branchName, boolean showTransactions) {
        Branch checkedBranch = new Branch(branchName);
        if (findBranch(branchName) != null) {
            for (int i=0; i<checkedBranch.getCustomers().size(); i++) {
                System.out.println("Customer #" + (i + 1) + ". " + checkedBranch.getCustomers().get(i));
                if (showTransactions)
                    for (int j = 0; j<checkedBranch.getCustomers().size(); i++)
                        System.out.println("Transaction #" + (j+1) + checkedBranch.getCustomers().get(i).getTransactions().get(j));
            }
        return true;
    }
        return false;
    }

    private Branch findBranch (String branchName) {
        for (int i=0; i<branches.size(); i++)
            if (branches.get(i).getName().equals(branchName))
                return branches.get(i);
        return null;
    }
}
