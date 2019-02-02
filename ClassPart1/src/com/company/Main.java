package com.company;

public class Main {

    public static void main(String[] args) {
        Car Prosche = new Car(); //initialize the object;
        Car Honda = new Car();

        Prosche.setModel("911");
        // advantage of using setter is we can insert validation before actually set the data;
        System.out.println("Model is " + Prosche.getModel());
    }
}
