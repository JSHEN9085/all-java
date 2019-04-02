package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/flatironschool/Development/JavaDB/testDB/testjava.db");
            System.out.println("created db");
        } catch(SQLException e){
            System.out.println("connection error " + e.getMessage());
        }
    }
}
