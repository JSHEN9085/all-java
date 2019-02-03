package com.company;

public class Car {
    private int door;
    private int wheels;
    private String model ;
    private String engine;
    private String color;

    public void setModel(String model){ //this is setter
        if (model == "911" || model == "Cayenne"){
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel(){ // this is getter
        return this.model;
    }
}
