package com.company;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "test.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {
        try
        {
//            Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db"); //hard coding version"jdbc:sqlite:filename.db"; it will create database file in this project file
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            System.out.println("connect db");
//            connection.setAutoCommit(false); //setting this JDBC won't auto commit, and database won't save any change;
            Statement statement = connection.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME +  " TEXT, " +
                    COLUMN_PHONE +  " INTEGER, " +
                    COLUMN_EMAIL + " TEXT)");

            insertContact(statement, "Tim", 6545678, "tim@email.com");
            insertContact(statement, "Joy", 1234567, "joy@email.com");
            insertContact(statement, "Jun", 9172222, "jun@email.com");
            insertContact(statement, "Cat", 9876543, "cat@email.com");

//
//            statement.execute("UPDATE contacts SET phone=1234567 WHERE name='Cat'");
//
//            statement.execute("DELETE FROM contacts WHERE name='Cat'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS); //same as above two lines;
            while(results.next()){
                System.out.println(results.getString(COLUMN_NAME) + " " +
                                   results.getString(COLUMN_PHONE) + " " +
                                   results.getString(COLUMN_EMAIL) + "!"
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

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                "(" + COLUMN_NAME + "," +
                COLUMN_PHONE + "," +
                COLUMN_EMAIL + ") " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
