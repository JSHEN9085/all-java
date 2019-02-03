package com.company;

public class Dog extends Animal { //using key word extends to inheritance;

    //below is unique for Dog class
    private int eyes;
    private int legs;
    private int tails;
    private int teech;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teech, String coat) {
        //dog only has one brain and body, so we don't need to pass argument for those
        //instead, we directly put 1 in constructor;
        //if dog class has additional properties, just pass it in addition to Animal like this arguments;
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teech = teech;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat(); // call Animal.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() is called");
        move(2);
    }

    public void run() {
        System.out.println("Dog.run() is called");
        move(5);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed); //super means only look at the method in super class (Animal class in this case);
    }
}
