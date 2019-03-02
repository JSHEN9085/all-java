package com.company;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        //created album1 and add some songs into it;
	    Album album1 = new Album("Stormbringer", "Deep Purple");
	    album1.addSong("Holy man", 4.6);
        album1.addSong("The gypst", 4.22);
        album1.addSong("Moon", 4.3);
        album1.addSong("Sun", 3.21);
        albums.add(album1);

        //created album2 and add some songs into it;
        Album album2 = new Album("Rock", "AC/DC");
        album2.addSong("I put my finger on you", 4.21);
        album2.addSong("Evil walks", 5.21);
        album2.addSong("Breaking rules", 3.7);
        album2.addSong("You can't fly", 4.51);
        albums.add(album2);

        //select the album from the albums list, and then all song into the playlist;
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(1).addToPlayList("You can't fly", playList);
        albums.get(1).addToPlayList("Breaking rules", playList);
        albums.get(0).addToPlayList("Sun", playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No song in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist completed");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                    }
                    forward = true;
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have started the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("now replaying " + listIterator.previous().toString());
                            forward = false;

                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have started the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available action: \npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playList\n" +
                "5 - print available actions\n" +
                "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("====================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("====================");
    }
}
