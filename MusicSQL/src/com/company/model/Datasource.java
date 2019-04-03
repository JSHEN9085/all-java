package com.company.model;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Datasource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUMS_ID = "_id";
    public static final String COLUMN_ALBUMS_NAME = "name";
    public static final String COLUMN_ALBUMS_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTISTS_ID = "_id";
    public static final String COLUMN_ARTISTS_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONGS_TRACK = "track";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ALBUM = "album";

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

    private Connection connection;

    public boolean open(){
        try
        {
            connection = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Can't connect to database" + e.getMessage());
            return false;
        }
    }

    public void close() {
        try
        {
            if (connection != null){
                connection.close();
            }
        }
        catch (SQLException e)
        {
            System.out.println("Can't close connection" + e.getMessage());
        }
    }

    public List<Artist> queryArtists(int sortOrder) {
        StringBuilder query = new StringBuilder("SELECT * FROM ");
        query.append(TABLE_ARTISTS);
        if(sortOrder != ORDER_BY_NONE){
            query.append(" ORDER BY ");
            query.append(COLUMN_ARTISTS_NAME);
            query.append(" COLLATE NOCASE ");
            if(sortOrder == ORDER_BY_DESC){
                query.append("DESC");
            } else {
                query.append("ASC");
            }
        }

        try (
             Statement statement = connection.createStatement();
             ResultSet results = statement.executeQuery(query.toString())
            )
        {
            List<Artist> artists = new ArrayList<>();
            while(results.next()){
                Artist artist = new Artist();
                artist.setId(results.getInt(COLUMN_ARTISTS_ID));
                artist.setName(results.getString(COLUMN_ARTISTS_NAME));
                artists.add(artist);
            }
            return artists;
        }
        catch (SQLException e)
        {
            System.out.println("Query failed " + e.getMessage());
            return null;
        }
    }

}
