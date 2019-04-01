package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList items = new ArrayList();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add("Jun");
//        items.add(4);
//        items.add(5);
//        printDouble(items);

        FootballPlayer joy = new FootballPlayer("Joy");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer backham = new SoccerPlayer("Backham");

        Team<FootballPlayer> ny = new Team<>("New York");
        ny.addPlayer(joy);
//        ny.addPlayer(pat);
//        ny.addPlayer(backham);
        System.out.println(ny.numPlayer());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("New York");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("New York");
        soccerPlayerTeam.addPlayer(backham);

    }

    public static void printDouble(ArrayList n){
        for (Object i : n){
            System.out.println(i);
        }
    }
}
