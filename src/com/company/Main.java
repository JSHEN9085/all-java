package com.company;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
	    int myIntValue = 5 / 2;

        //width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 3f; //f after the value means float;

        //width of double = 64 (8 bytes), use double is better
        double myDoubleValue = 5d / 3d;
        //for number with decimal point(ex 5.15) Java will automatically assume it is double;
        //d after the value means double;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);



        double myPounds = 200d;
        double convertKg = myPounds * 0.45359237d;
        System.out.println("kg = " + convertKg);

        double pi = 3.141_592_7d;
        System.out.println("pi = " + pi);
    }
}
