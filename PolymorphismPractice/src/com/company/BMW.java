package com.company;

class BMW extends Car {
    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "BMW -> start";
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate";
    }

    @Override
    public String brake() {
        return "BMW -> brake";
    }
}

