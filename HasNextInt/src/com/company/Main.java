package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while(count <= 10){
            System.out.println("Enter Number #" + count + ":");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Sum is " + sum);
        scanner.close();
    }
}
