package com.oneoonenet;

public class Main {
    public static void main(String[] args) {
        int initialValue = 17_377; // edit this value to affect output
        int i, j;
        boolean foundOne = false;
        System.out.println("What are the multipliers of " + initialValue + "?");
        for (i = 2; i <= initialValue; i++) {
            for (j = i; j <= initialValue; j++) {
                if (i * j == initialValue) {
                    System.out.println(i + " * " + j + " = " + i * j);
                    foundOne = true;
                } else {
                    System.out.println("i = " + i + " j = " + j + " i * j = " + i * j);
                }
            }
        }
        if (!foundOne) {
            System.out.println(initialValue + " is prime.");
        }
    }
}