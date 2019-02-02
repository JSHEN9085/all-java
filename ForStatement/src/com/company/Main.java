package com.company;

public class Main {

    public static void main(String[] args) {
	    double pay = calculateInterest(1000.0, 5.0);
        System.out.println("Interest will be " + pay);

//        for(int i = 0; i < 5; i++) {
//            System.out.println("Loop" + i + " hello!");
//        }

        for (int i = 1; i < 6; i++) {
            System.out.println("If interest is " + i + "%, interest is " + String.format("%.2f", calculateInterest(1000.0, i)));
            //String.format(%.2f, double); %.2f means format the floating point num to 2 decimal place
            // "f" means floating point number, including double and float;
        }

        System.out.println(isPrime(9));
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int number) {
        if (number == 1){
            return false;
        }

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
