package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount() {
        //if constructor is called without arguments, we could set a default below;
        this("111111", 50.0, "No name", "No Email", "No phone number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(
            String accountNumber,
            double balance,
            String customerName,
            String email,
            String phone
    ) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    //shortcut for setter and getter is ;
    //go to menu > code > generate > setter and getter;
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdrawal(double amount){
        if (this.balance > amount){
            this.balance -= amount;
            System.out.println("Your new balance is " + this.balance);
        } else {
            System.out.println("Your account doesn't have enough balance");
        }
    }
}
