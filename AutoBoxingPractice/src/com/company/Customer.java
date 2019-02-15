package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction; //ArrayList must take class inside <>;

    public Customer(String name, double amount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(amount);
    }

    public void addTransaction(double amount){
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
