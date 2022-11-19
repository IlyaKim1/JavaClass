package com.java.class09;

import java.util.Scanner;

public class LadderIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your weight: ");
        int weight = sc.nextInt();

       /* if (age >= 18 && weight >= 50) {
            System.out.println("You're eligible to donate blood");
        } else if (age < 18 && weight >= 50) {
            System.out.println("You're too young to donate blood");
        } else if (age >= 18 && weight < 50) {
            System.out.println("You're underweight to donate blood. Please eat more and come back later");
        } else if (age < 18 && weight < 50) {
            System.out.println("You're not eligible to donate blood. You need it more");
        }*/
        // 2nd approach - nested if-else


        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You're eligible");
            } else {
                System.out.println("you're underweight");
            }
        } else {
            if (weight >= 50) {
                System.out.println("you're too young to donate blood");
            } else {
                System.out.println("you're not eligible");
            }

        }

    }
}
