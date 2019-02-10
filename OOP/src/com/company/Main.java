package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.99, "White");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.50);
        hamburger.addHamburgerAddition2("Egg", 1.00);
        hamburger.addHamburgerAddition3("Cheese", 0.80);
        System.out.println("Total price is " + hamburger.itemizedHamburger());

        HealthBurger healthBurger = new HealthBurger("Bacon", 5.99);
        healthBurger.addHamburgerAddition1("Egg", 1.00);
        healthBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total healthy burger price is " + healthBurger.itemizedHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizedHamburger();
    }
}
