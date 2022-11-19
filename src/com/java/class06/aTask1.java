package com.java.class06;

import java.util.Scanner;

public class aTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number, that you want to know a square of");
        double num = sc.nextDouble();
        double square = num * num;
        System.out.println("The square of " + num + " is " + square);

    }
}
