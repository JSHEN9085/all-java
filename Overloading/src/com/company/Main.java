package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        calculateScore(750);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " point ");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player" + " scored " + score + " point ");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No Player name, no score");
        return 0;
    }

//    public static void calculateScore(){
//        System.out.println("No Player name, no score");
//
//    }
// the signature is their arguments, changing the returned data type
// won't let Java identify them as two different methods;
}
