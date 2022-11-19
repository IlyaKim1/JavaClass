package com.java.class06;

import java.util.Scanner;

public class Meprogramm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int a = sc.nextInt();
        int b = 100;

        System.out.println("You have spent " + a * 12 + " months in this world");
        System.out.println("You have spent " + a * 365 + " days in this world");
        System.out.println("You have spent " + a * 365 * 24 * 60 + " minutes in this world");

    }
}
