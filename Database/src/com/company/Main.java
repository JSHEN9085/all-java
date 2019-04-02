package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db"); //"jdbc:sqlite:filename.db"; it will create database file in this project file
            System.out.println("connect db");

            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

            statement.close();
            connection.close();
        }
        catch(SQLException e)
        {
            System.out.println("connection error " + e.getMessage());
        }

    }
}
