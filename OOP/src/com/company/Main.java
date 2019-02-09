package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.99, "White");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.50);
        hamburger.addHamburgerAddition2("Egg", 1.00);
        hamburger.addHamburgerAddition3("Cheese", 0.80);
        System.out.println("Total price is " + hamburger.itemizedHamburger());
    }
}
