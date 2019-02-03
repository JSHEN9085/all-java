package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount myAccount = new BankAccount("123456", 500, "Jun Jian Shen", "Jun@flatironschool.com", "1234567890" );
//	    myAccount.setAccountNumber("123456");
//	    myAccount.setBalance(500);
//	    myAccount.setCustomerName("Jun Jian Shen");
//	    myAccount.setEmail("Jun@flatironschool.com");
//	    myAccount.setPhone("1234567890");

	    myAccount.deposit(10000.0);

	    myAccount.withdrawal(1000.0);

        System.out.println(myAccount.getAccountNumber());
    }
}
