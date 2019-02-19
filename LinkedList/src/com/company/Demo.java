package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) { //shortcut psvm -> tab
        LinkedList<String> places = new LinkedList<String>();
        addInOrder(places, "Sydney");
        addInOrder(places,"Melbourne");
        addInOrder(places,"Brisbane");
        addInOrder(places,"Perth");
        addInOrder(places,"Canberra");
        addInOrder(places,"Adelaide");
        addInOrder(places,"Darwin");
        printList(places);

        addInOrder(places, "Alice Springs");
        addInOrder(places, "Darwin");

        printList(places);
        visit(places);
//        places.add(1, "Alice Sprint");
//        printList(places);
//
//        places.remove(4);
//        printList(places);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==================");
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity ){
        ListIterator<String> i = linkedList.listIterator();
        while (i.hasNext()){
            int comparison = i.next().compareTo(newCity);
            if(comparison == 0){
                //equal, don't add it;
                System.out.println(newCity + " is already included");
                return false;
            } else if (comparison > 0){
                //new City should appear before this one;
                i.previous();
                i.add(newCity);
                return true;
            } else if(comparison < 0) {
                //move on to next city;

            }
        }
        i.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now Visting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()){
                        System.out.println("Visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \n press ");
        System.out.println("0 - to quit \n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
