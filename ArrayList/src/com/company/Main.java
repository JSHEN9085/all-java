package com.company;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[3];
    public static void main(String[] args) {
        System.out.println("Enter 3 integers");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.println("Enter 4 integers");
//        getInput();
        baseData[3] = 11;
        printArray(baseData);
    }

    private static void getInput() {
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " has value " + array[i]);
        }
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[4];
        for (int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }

}
