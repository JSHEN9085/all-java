package com.company;

public class Car extends Vehicle {
    private int doors;
    private int engineDisplacement;

    public Car(String name, int doors, int engineDisplacement) {
        super(name);
        this.doors = doors;
        this.engineDisplacement = engineDisplacement;
    }
}
