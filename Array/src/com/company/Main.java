package com.company;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//	    int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // not using [], but {}, different from JS;
//	    double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[4]);
//
//        int[] mySecondArray = new int[10];
//
//        for (int i = 0; i < mySecondArray.length; i++){
//            mySecondArray[i] = i + 1;
//        }
//        System.out.println(mySecondArray[9]);
//
//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array){
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }

      private static Scanner scanner = new Scanner(System.in);

      public static void main(String[] args){
          int[] myIntegers = getIntegers(5);
          for (int i = 0; i < myIntegers.length; i++ ){
              System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
          }
          System.out.println("The Average is "+ getAverage(myIntegers));
      }

      public static int[] getIntegers(int number){
          System.out.println("Enter " + number + " Integer value. \r");
          int[] values = new int[number]; //number means the length of this array;

          for (int i = 0; i < number; i++){
              values[i] = scanner.nextInt();
          }
          return values;
      }

      public static double getAverage(int[] array){
          int sum = 0;
          for(int i = 0; i < array.length; i++){
              sum += array[i];
          }
          return (double) sum / (double) array.length;
      }

}
