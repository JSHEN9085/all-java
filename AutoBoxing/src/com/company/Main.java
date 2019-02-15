package com.company;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] inArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Jun");

        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>(); //ArrayList<> inside <> must be a class;
        intArrayList.add(new IntClass(54));
        Integer integer = new Integer(54); //Integer is a class
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++){
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++){
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }


    }
}
