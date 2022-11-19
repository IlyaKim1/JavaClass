package com.java.class15;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        equalLine();
        int num = sc.nextInt();

        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;

        }
        equalLine();
        System.out.println("The factorial of " + num + " is: " + sum);
        equalLine();
    }
    static void equalLine(){
        System.out.println("===================================================");
    }
}
