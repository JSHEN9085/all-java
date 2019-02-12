package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5]; // each element will be default as 0, and array is reference type;
        int[] anotherArray = myIntArray; // anotherArray and myIntArray will refer to a same memory;
//        int[] anotherArray = new int[5]; // by this way, anotherArray will be different to myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray)); //myIntArray also changed
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray)); //anotherArray is absolutely changed;

        anotherArray = new int[] {4, 5, 6, 7, 8}; // making another object and therefore refer to a new memory;
        modifyArray(myIntArray); // also modify the reference;
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray)); //myIntArray also changed
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray)); //anotherArray is absolutely changed;
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
