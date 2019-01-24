package com.company;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2 bytes);
	    char myChar = '\u00A9';
        //   format is + row number + column number;
	    // can only has one character;
        // we are using unicode character here, there fore it has more than 1 character, but the out put is one character;
        System.out.println("args = " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;
    }
}
