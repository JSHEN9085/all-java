package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroeryList groeryList = new GroeryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groeryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
}
