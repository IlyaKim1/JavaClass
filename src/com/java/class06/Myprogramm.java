package com.java.class06;

import java.util.Scanner;

public class Myprogramm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        System.out.println("Enter your third number");
        int c = sc.nextInt();

        System.out.println("The average of your numbers is " + (a + b + c) / 3.0);




    }
}
