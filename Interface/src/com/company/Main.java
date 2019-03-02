package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone; //this need to use interface name;
        timsPhone = new DeskPhone(123456789); // "DeskPhone" must be used the class name, instead of interface name;

        timsPhone.powerOn();
        timsPhone.callPhone(1234);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }
}
