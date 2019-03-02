package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songsList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songsList = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double songDuration){
        if(findSong(songTitle) == null){
            this.songsList.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle){
        for(Song song : this.songsList){
            if (song.getTitle() == songTitle){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if(index >= 0 && index <= this.songsList.size()){
            playList.add(this.songsList.get(index));
            return true;
        }
        System.out.println("This album does not have a track "+ trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkSong = findSong(title);
        if(checkSong != null){
            playList.add(checkSong);
            return true;
        }
        System.out.println("The song " + title + " is not in the album");
        return false;
    }
}
