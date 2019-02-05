package com.company;

public class Pilot extends Car {
    private int roadServiceMonths;
    private String trim;

    public Pilot(int gears, int roadServiceMonths, String trim) {
        super("Pilot", "Mid-size", 4, 5, gears, false);
        this.roadServiceMonths = roadServiceMonths;
        this.trim = trim; 
    }
}
