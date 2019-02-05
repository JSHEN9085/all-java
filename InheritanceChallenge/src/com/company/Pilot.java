package com.company;

public class Pilot extends Car {
    private int roadServiceMonths;
    private String trim;

    public Pilot(int gears, int roadServiceMonths, String trim) {
        super("Pilot", "Mid-size", 4, 5, gears, false);
        this.roadServiceMonths = roadServiceMonths;
        this.trim = trim;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        } else if (newVelocity > 40 && newVelocity <= 50){
            changeGear(4);
        } else if (newVelocity > 50 && newVelocity <= 60){
            changeGear(5);
        } else {
            changeGear(6);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
