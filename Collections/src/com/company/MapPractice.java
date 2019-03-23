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

        for(String key : languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }
        System.out.println("====================================");
    }
}
