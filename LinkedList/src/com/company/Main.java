package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Jun", 100.0);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(50.0);
        System.out.println("Customer " + customer.getName() + " is " + customer.getBalance());
        // result will be 50, because they are both refer to the same memory;

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 7);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
