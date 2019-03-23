package com.company;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "OOP");
        languages.put("Python", "Data Science");
        languages.put("C++", "College main language");
        languages.put("JavaScript", "Front-end key language");
        languages.put("Ruby", "Less popular");

        System.out.println(languages.get("Java"));
        languages.put("Java", "Spring Framework");
        System.out.println(languages.get("Java")); //simply over write the original value;

        System.out.println(languages.get("C#")); //calling a key that is not exist will get null

        if(languages.containsKey("Java")){
            System.out.println("Java is one of the keys");
        } else {
            System.out.println("Java is not here");
        }

        System.out.println("====================================");
        if(languages.containsKey("C++")){
            System.out.println(languages.remove("C++")); //this will return the value of the key("C++" for here)
            System.out.println(languages.remove("Ruby", "Less popular")); //if we pass both key and value, return boolean
        } else {
            System.out.println(languages.remove("Hello")); //if HashMap doesn't have the key, return null
        }
        System.out.println("====================================");

        System.out.println(languages.replace("Python", "Machine Learning")); //assign new value for the same key

        if(languages.replace("JavaScript", "Front-end key language", "Can be run in back-end")){
            System.out.println("JS is replaced");
        } else {
            System.out.println("JS is not replaced");
        }

        for(String key : languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }
        System.out.println("====================================");
    }
}
