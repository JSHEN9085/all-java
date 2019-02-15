package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) != null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName, amount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(customName, amount);
        }
        return false;
    }

    private Branch findBranch(String name){
        for (int i = 0; i < branches.size(); i++){
            if(this.branches.get(i).getName().equals(name)){
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]" );
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + (j + 1) + "] Amount" + transactions.get(i));
                    }
                }
            }
            return true;
        } else {

        }
        return false;
    }
}
