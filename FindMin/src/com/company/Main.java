package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] array = readIntegers(5);
	    findMin(array);
    }

    public static int[] readIntegers(int count){
        int[] myArray = new int[count];
        System.out.println("Enter number " + count + " integers value: \r");
        for (int i = 0; i < count; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Minimum is " + min);
        return min;
    }
}
