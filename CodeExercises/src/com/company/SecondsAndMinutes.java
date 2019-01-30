package com.company;

public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    // key world "final" means once we declared the valuable, we can't change it;

    public static void main(String[] args){
        System.out.println(getDurationsString(65, 70));
        System.out.println(getDurationsString(3045));
    }

    public static String getDurationsString(long minutes, long second){
        if (minutes < 0 || second < 0 || second > 59){
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMin = minutes % 60;

        String hourString = hours + "h";
        String minString = remainingMin + "min";
        String secString = second + "s";

        if (hours < 10) {
            hourString = "0" + hourString;
        }

        if (remainingMin < 10) {
            minString = "0" + minString;
        }

        if (second < 10){
            secString = "0" + secString;
        }
        return hourString + " " + minString + " " + secString;
    }

    private static String getDurationsString(long second){
        if (second < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = second / 60;
        long sec = second % 60;
        return getDurationsString(minutes, sec); //calling above method;
    }
}
