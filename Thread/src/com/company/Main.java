package com.company;

import static com.company.ThreadColor.*;


public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "This is main");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName(" == another Thread == ");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "hello from anonymous thread");
            }
        }.start();

        Thread myRunnableThread = new Thread (new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "hello fro anonymous class's implement of run()");
            }
        });

        myRunnableThread.start();
        System.out.println(ANSI_PURPLE + "hello from main again");

//        anotherThread.start();
    }
}
