package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println("myString is " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is " + myString);
        myString = myString + "\u00A9 2015";
        System.out.println("myString is " + myString);

        String numString = "250.55";
        numString = numString + "49.55";
        System.out.println("The result is " + numString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        //result of above is string 1050, same thing in JavaScript;

        //contains
        String hello = "Hello World";
        System.out.println("hello has h? " + hello.contains("h")); //false, contains is case sensitive
        System.out.println("hello has H? " + hello.contains("H")); //true, contains is case sensitive

        //contentEquals
        String equals = "Is is same?";
        System.out.println("content is same? " + equals.contentEquals("something else"));
        System.out.println("content is same? " + equals.contentEquals("Is is same?"));

        //copyValueOf, using to combine char array to a String
        char[] ch = {'T', 'e', 's', 't'};
        String ch2 = "";
        ch2 = ch2.copyValueOf(ch);
        System.out.println(ch2);

        //endsWith
        String ending = "It is ended";
        System.out.println("Is ending ends with 'd'? " + ending.endsWith("d"));

        //equals
        String same = "is it same";
        System.out.println("is it same? " + same.equals("is it same"));

        //indexOf
        String example = "Hello World";
        System.out.println(example.indexOf('e'));

        //lastIndexOf
        String lastPosition = "Hello";
        System.out.println("Last index of 'l' is " + lastPosition.lastIndexOf('l'));
        System.out.println("Last index of 'll' is " + lastPosition.lastIndexOf("ll")); //return the beginning index of the searching String;

        //isEmpty && isBlank
        String empty = "";
        System.out.println("is empty? " + empty.isEmpty());
        System.out.println("is blank? " + empty.isBlank());

        String emptySpace = "    ";
        System.out.println("is empty? " + emptySpace.isEmpty()); //will count space as content
        System.out.println("is blank? " + emptySpace.isBlank()); //only look for actual content

        //replace
        String replacing = "aabcc";
        System.out.println("new String is: " + replacing.replace('b', 'd')); //return the new String
        System.out.println("old String is unchanged: " + replacing);

        //split
        String stringToSplit = "I finished 5 leetcode problems today!";
        String[] stringArray = stringToSplit.split(" ");
        System.out.println(stringArray.length);
        for (String element : stringArray){
            System.out.println(element);
        }

        //toCharArray
        String date = "Sunday";
        System.out.println(date.toCharArray());

        //trim
        String manySpace = "     space     ";
        System.out.println(manySpace);
        System.out.println(manySpace.trim());
        System.out.println("doesn't mutate the original" +manySpace);

        //valueOf
        int number = 10;
        System.out.println(String.valueOf(number));
    }
}
