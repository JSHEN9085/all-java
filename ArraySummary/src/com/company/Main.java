package com.company;
import java.util.Arrays;

public class Main {
    private static int[] array = {1,2,3,4,5};

    public static void main(String[] args) {
        System.out.println(array);
        System.out.println(Arrays.stream(array).anyMatch(x -> x == 1));
    }
}
