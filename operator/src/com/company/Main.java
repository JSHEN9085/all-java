package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 3;
        System.out.println("1 + 2 = " + result);

//        result = result - 1;
//        System.out.println("result is " + result);

        int previousResult = result;
        result = result * 10;
        System.out.println("previousResult" + " *10 = " + result);

        result = result / 5;
        System.out.println("previousResult" + " /5 = " + result);


        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("He is not an Alien");

        int topScore = 90;
        if (topScore < 100)
            System.out.println("you got high score");

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("greater than second Top and less than 100");

        if (topScore > 90 || secondTopScore <= 90)
            System.out.println("one of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is a car");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);


        double firstDouble = 20d;
        double secondDouble = 80d;

        double total = (firstDouble + secondDouble)*25;
        double remainder = total % 40;

        if(remainder <= 20)
            System.out.println("Total is over the limit");
    }
}
