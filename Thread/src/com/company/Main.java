package com.company;

import static com.company.ThreadColor.ANSI_PURPLE;
import static com.company.ThreadColor.ANSI_RED;
import static com.company.ThreadColor.ANSI_GREEN;


public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "This is main");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "hello from anonymous thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE + "hello from main again");

//        anotherThread.start();
    }
}
