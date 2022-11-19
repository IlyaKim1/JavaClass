package com.java.class08;

import java.util.Scanner;

public class aHW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your bill amount: ");
        double bill = sc.nextDouble();

        if (bill >= 10000) {
            double total = (bill * 20) / 100;
            System.out.println("Your total after discount is: " + (bill - total));
        } else if (bill >= 5000) {
            double total = (bill * 15) / 100;
            System.out.println("Your total after discount is: " + (bill - total));
        } else if (bill >= 2000) {
            double total = (bill * 10) / 100;
            System.out.println("Your total after discount is: " + (bill - total));
        } else if (bill >= 1000) {
            double total = (bill * 5) / 100;
            System.out.println("Your total after discount is: " + (bill - total));
        } else {
            System.out.println("You're not eligible for a discount. Your new total is: " + bill);
        }
    }
}
