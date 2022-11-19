package com.java.class09;

import java.util.Scanner;

public class aHW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount as a whole number, get your pennies later");
        int m = sc.nextInt();
        System.out.println();
        int bill = m % 500, bill1 = bill % 100, bill2 = bill1 % 20, bill3 = bill2 % 10, bill4 = bill3 % 5, bill5 = bill4 % 2;

        if (m % 500 == m) {
            System.out.println("No 500 bills");
        } else if (m % 500 >= 0) {
            System.out.println("You will need " + m / 500 + " 500 bills");
        }
        if (bill % 100 == bill) {
            System.out.println("No 100 bills");
        } else if (bill % 100 >= 0) {
            System.out.println("You will need " + bill / 100 + " 100 bills");
        }
        if (bill1 % 20 == bill1) {
            System.out.println("No 20$ bills");
        } else if (bill1 % 20 >= 0) {
            System.out.println("You will need " + bill1 / 20 + " 20 bills");
        }
        if (bill2 % 10 == bill2) {
            System.out.println("No 10 bills");
        } else if (bill2 % 10 >= 0) {
            System.out.println("You will need " + bill2 / 10 + " 10 bills");
        }
        if (bill3 % 5 == bill3) {
            System.out.println("No 5 bills");
        } else if (bill3 % 5 >= 0) {
            System.out.println("You will need " + bill3 / 5 + " 5 bills");
        }
        if (bill4 % 2 == bill4) {
            System.out.println("No 2 bills");
        } else if (bill4 % 2 >= 0) {
            System.out.println("You will need " + bill4 / 2 + " 2 bills");
        }
        if (bill5 % 1 == bill5) {
            System.out.println("No 1 bills");
        } else if (bill5 % 1 >= 0) {
            System.out.println("You will need " + bill5 / 1 + " 1 bills");
        } else {
            System.out.println("Please input valid number");

        }
    }
}

