package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "2018";
        System.out.println("myString is " + myString);

        int number = Integer.parseInt(myString);
        double doubleNumber = Double.parseDouble(myString);
        System.out.println("number is " + number);
        System.out.println("Double is " + doubleNumber);

        myString+=1;
        number+=1;
        System.out.println("myString is " + myString);
        System.out.println("number is " + number);

        String numberAsString = Integer.toString(number);
        System.out.println(numberAsString);

    }
}
