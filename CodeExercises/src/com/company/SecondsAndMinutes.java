package com.company;

public class SecondsAndMinutes {
    public static void main(String[] args){
        System.out.println(getDurationsString(65, 46));
        System.out.println(getDurationsString(3045));
    }

    public static String getDurationsString(long minutes, long second){
        if (minutes < 0 || second < 0 || second > 59){
            return "invalid value";
        }
        long hours = minutes / 60;
        long remainingMin = minutes % 60;
        return hours + "h " + remainingMin + "min " + second + "s";
    }

    private static String getDurationsString(long second){
        if (second < 0){
            return "invalid second";
        }
        long minutes = second / 60;
        long sec = second % 60;
        return getDurationsString(minutes, sec); //calling above method;
    }
}
