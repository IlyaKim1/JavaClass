package com.java.class06;

import java.util.Scanner;

public class aTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your bill without the discount: ");
        double bill = sc.nextDouble();
        System.out.println("Please enter you discount in %: ");
        double discount = sc.nextDouble();
        double amount = bill * discount / 100;
        double total = bill - amount;
        System.out.println("Your discount is: " + amount + "$");
        System.out.println("Your new total is: " + total + "$");

    }
}
