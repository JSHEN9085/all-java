package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) { //shortcut psvm -> tab
        LinkedList<String> places = new LinkedList<String>();
        places.add("Sydney");
        places.add("Melbourne");
        places.add("Brisbane");
        places.add("Perth");
        places.add("Canberra");
        places.add("Adelaide");
        places.add("Darwin");

        printList(places);

        places.add(1, "Alice Sprint");
        printList(places);

        places.remove(4);
        printList(places);
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
    }

}
