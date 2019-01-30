package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1){
//            System.out.println("value is 1");
//        } else if (value == 2){
//            System.out.println("value is 2");
//        } else {
//            System.out.println("value is not 1 or 2");
//        }

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("value is 1");
                break; //stop the switch statement;

            case 2:
                System.out.println("value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("value is greater than 2");
                break;

            default:
                System.out.println("value is not between 0 and 6");
                break;
        }

        char charValue = 'a'; //char must use '', can't use ""
        switch(charValue){
            case 'a':  //meet the condition that argument in line 36 == the case;
                System.out.println("a is found");
                break;

            case 'b':
                System.out.println("b is found");

            case 'c': case 'd': case 'e':
                System.out.println("it is either c, d or e");
                break;

            default:
                System.out.println("it is not a, b, c, d, or e");
                break;
        }

    }
}
