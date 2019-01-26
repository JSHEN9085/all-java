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

        int topScore = 100;
        if (topScore >= 100)
            System.out.println("you got high score");
    }
}
