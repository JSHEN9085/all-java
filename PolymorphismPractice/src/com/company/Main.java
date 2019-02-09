package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> start engine";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> brake";
    }
}

class Audi extends Car {
    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Audi -> start";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate";
    }

    @Override
    public String brake() {
        return "Audi -> brake";
    }
}

class Mercedes extends Car {
    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mercedes -> start";
    }

    @Override
    public String accelerate() {
        return "Mercedes -> accelerate";
    }

    @Override
    public String brake() {
        return "Mercedes -> brake";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(6, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Audi audi = new Audi(10, "Audi R8");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        BMW bmw = new BMW(4, "BMW X3");
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

        Mercedes mercedes = new Mercedes(6, "Mercedes GLE");
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());
    }
}
