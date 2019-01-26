package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("your score is less than 5000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver == true){
            int finalScore = score + levelCompleted * bonus;
            System.out.println("Your final Score " + finalScore);
        }

    }
}
