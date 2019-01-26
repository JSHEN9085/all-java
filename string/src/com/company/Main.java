package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println("myString is " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is " + myString);
        myString = myString + "\u00A9 2015";
        System.out.println("myString is " + myString);

        String numString = "250.55";
        numString = numString + "49.55";
        System.out.println("The result is " + numString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        //result of above is string, same thing in JavaScript;


    }
}
