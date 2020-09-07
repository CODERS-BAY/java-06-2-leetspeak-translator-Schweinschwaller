package com.codersbay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your text and end it with enter.");
        Scanner s = new Scanner(System.in);
        String inputStr = s.nextLine();

        String leet = "";
        for (int i = 0; i < inputStr.length(); i++) {
            leet += switch (inputStr.toUpperCase().charAt(i)) {
                case ('A') -> "@";
                case ('B') -> "8";
                case ('C') -> "(";
                case ('E') -> "3";
                case ('G') -> "6";
                case ('H') -> "#";
                case ('I') -> "!";
                case ('L') -> "1";
                case ('O') -> "0";
                case ('S') -> "$";
                case ('T') -> "7";
                case ('Z') -> "2";
                default -> inputStr.charAt(i);
            };
        }
        System.out.println("Your text in Leetspeak:");
        System.out.println(leet);
    }
}
