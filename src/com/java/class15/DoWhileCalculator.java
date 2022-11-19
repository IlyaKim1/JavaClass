package com.java.class15;

import java.util.Scanner;

public class DoWhileCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("========================================");
            System.out.println("Enter you first number");
            int num1 = sc.nextInt();
            System.out.println("========================================");
            System.out.println("Enter your second number");
            int num2 = sc.nextInt();
            System.out.println("========================================");
            System.out.println("Please enter the command");
            String comm = sc.next();
            System.out.println("========================================");

            switch (comm.toLowerCase()) {
                case "add":
                    System.out.println(num1 + num2);
                    break;
                case "sub":
                    System.out.println(num1 - num2);
                    break;
                case "mul":
                    System.out.println(num1 * num2);
                    break;
                case "div":
                    System.out.println(num1 / num2);
                    break;
                case "mod":
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println("========================================");
            System.out.println("Do you want to try one more time? Yes/No");
            System.out.println("Press 1 for Yes");
            System.out.println("Press 2 for No");
            System.out.println("========================================");
            choice = sc.nextInt();

        } while (choice == 1);
    }
}