package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db"); //"jdbc:sqlite:filename.db"; it will create database file in this project file
            System.out.println("connect db");
//            connection.setAutoCommit(false); //setting this JDBC won't auto commit, and database won't save any change;

            Statement statement = connection.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
//                    " (name TEXT, phone INTEGER, email TEXT)");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    " VALUES('Tim', 6545678, 'tim@email.com') ");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    " VALUES('Joy', 1234567, 'joy@email.com') ");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    " VALUES('Jun', 9172222, 'jun@email.com') ");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    " VALUES('Cat', 9876543, 'cat@email.com') ");

//            statement.execute("UPDATE contacts SET phone=1234567 WHERE name='Cat'");

//            statement.execute("DELETE FROM contacts WHERE name='Cat'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()){
                System.out.println(results.getString("name") + " " +
                                   results.getString("phone") + " " +
                                   results.getString("email") + "!"
                );
            }

            results.close(); //close ResultSet
            statement.close(); //close statement
            connection.close(); //disconnect
        }
        catch(SQLException e)
        {
            System.out.println("connection error " + e.getMessage());
        }

    }
}
