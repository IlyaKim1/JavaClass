package com.java.class08;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Please enter your second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Please choose your operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operation = sc.nextInt();

        if(operation > 4) {
            System.out.println("Please enter a number between 1-4");
        }else if(operation < 1){
            System.out.println("Please enter a number between 1-4");
        }else if(operation == 1){
            System.out.println("Answer is: " + (num1 + num2));
        }else if(operation == 2){
            System.out.println("Answer is: " + (num1 - num2));
        }else if(operation == 3){
            System.out.println("Answer is: " + (num1 * num2));
        }else if(operation == 4){
            System.out.println("Answer is: " + (num1 / num2));
        }
    }
}
