package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        // hasNextInt() This method returns true if and only if this scanner's next token is a valid int value

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //without this line, program would direct keep running and we don't have chance to enter the name;

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 150){ //in case user input invalid number in line 9;
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid Date of Birth");
            }
        } else {
            System.out.println("Invalid Date of Birth");
        }
        scanner.close();
    }
}
