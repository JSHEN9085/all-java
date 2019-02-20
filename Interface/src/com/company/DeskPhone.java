package com.company;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Phone has been plug in");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now is ringing, called by " + phoneNumber);
        isRinging = false;
    }

    @Override
    public void answer() {
        System.out.println("Phone is picked up");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
