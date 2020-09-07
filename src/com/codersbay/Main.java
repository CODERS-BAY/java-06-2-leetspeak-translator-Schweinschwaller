package com.codersbay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your text and end it with enter.");
        Scanner s = new Scanner(System.in);
        String inputStr = s.nextLine();

        String leet = "";
        for (int i = 0; i < inputStr.length(); i++) {
            switch (inputStr.toUpperCase().charAt(i)) {
                case ('A') -> leet += "@";
                case ('B') -> leet += "8";
                case ('C') -> leet += "(";
                case ('E') -> leet += "3";
                case ('G') -> leet += "6";
                case ('H') -> leet += "#";
                case ('I') -> leet += "!";
                case ('L') -> leet += "1";
                case ('O') -> leet += "0";
                case ('S') -> leet += "$";
                case ('T') -> leet += "7";
                case ('Z') -> leet += "2";
                default -> leet += inputStr.charAt(i);
            }
        }
        System.out.println("Your text in Leetspeak:");
        System.out.println(leet);
    }
}
