package com.java.class09;

import java.util.Scanner;

public class FindGreatestNumberOutOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter your second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter your third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is greatest");
            } else {
                System.out.println(num3 + " is greatest");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is greatest");
            } else {
                System.out.println(num3 + " is greatest");
            }
        }
    }
}

















