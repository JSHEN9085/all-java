package com.company;

import java.util.ArrayList;

public class GroeryList {

    private ArrayList<String> groceryList = new ArrayList<String>(); //ArrayList is a class, () is its constructor.

    public void addGroceryItem(String item){
        groceryList.add(item); //something like array.push() in JS;
    }

    public void printGroceryList() {
        System.out.println("You are " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position - 1, newItem);
        System.out.println("Grocery item " + (position) + "has been modified");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(theItem + "has been removed");
    }

    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position > -1){
            return groceryList.get(position);
        }
        return null;
    }
}
