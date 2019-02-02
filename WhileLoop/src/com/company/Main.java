package com.company;

public class Main {

    public static void main(String[] args) {
        // 1st expression;
	    int count = 0;
	    while(count != 5){
            System.out.println("Count is " + count);
            count++;
        }
	    //loop will be running until count == 4; it won't skip 5 and going forward;

        // 2nd expression;
        count = 0;
        while(true){
            if(count == 6){
                break; //stop the loop;
            }
            System.out.println("Count is " + count);
            count++;
        }

        // 3rd expression;
        count = 0;
        do{
            System.out.println("Count is " + count);
            count++;
        } while(count != 6);
    }
}
