package com.SelfLearning;

import java.util.Scanner;

public class BasicsPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ==========================================================================================================
//        Write a program that take a number form the user and displays whether the entered number is an Even number
//        or an Odd number.
//        ==========================================================================================================
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        if(num % 2 == 0){
//            System.out.println("The number " + num + " is Even");
//        }else{
//            System.out.println("The number " + num + " is Odd");
//        }
//        ==========================================================================================================
//        Write a program that asks the user to enter a number and displays the absolute value of that number.
//        ==========================================================================================================
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//
//        if(num < 0){
//            num -= num * 2;
//        }
//        System.out.println("The absolute value of the entered number is " + num);

//        ==========================================================================================================
//        Write a program that asks the user to enter product price and quantity and then calculate the revenue. If
//        the revenue is more than 5000 a discount of 10% is offered. Program should display the discount and net
//        value.
//        ==========================================================================================================

//        System.out.println("Enter the quantity of products you got");
//        int q = sc.nextInt();
//        System.out.println("Enter the price of the product");
//        double price = sc.nextDouble();
//        double discount;
//        double net = q * price;
//
//        if(net > 5000){
//            discount = net * 0.10;
//            System.out.println("\nThe discount on your purchase is " + discount);
//        }
//        System.out.println("Your total is " + net);
//        ==========================================================================================================
//        Write a program that asks the user to enter three numbers and the displays the largest number out of them.
//        ==========================================================================================================
//        System.out.println("Enter the first number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number");
//        int num2 = sc.nextInt();
//        System.out.println("Enter the third number");
//        int num3 = sc.nextInt();
//
//        if(num1 > num2 && num1 > num3){
//            System.out.println("The biggest number is " + num1);
//        }else if(num2 > num1 && num2 > num3){
//            System.out.println("The biggest number is " + num2);
//        }else{
//            System.out.println("The biggest number is " + num3);
//        }
//        ==========================================================================================================
//        Write a program that prompts a user to enter a number and displays whether number is negative, positive or
//        zero
//        ==========================================================================================================

//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//
//        if(num < 0){
//            System.out.println(num + " is a negative number");
//        }else if(num > 0){
//            System.out.println(num + " is a positive number");
//        }else{
//            System.out.println(num + " is zero");
//        }
//        ==========================================================================================================
//        A triangle is valid if the sum of all three sides of it is equal to 180. Ask the user to enter three
//        integers as angles and check whether a triangle is valid or not
//        ==========================================================================================================
//        System.out.println("Enter first angle");
//        int a1 = sc.nextInt();
//        System.out.println("Enter second angle");
//        int a2 = sc.nextInt();
//        System.out.println("Enter third angle");
//        int a3 = sc.nextInt();
//
//        int tri = a1 + a2 + a3;
//        if(tri == 180){
//            System.out.println("The triangle is valid");
//        }else{
//            System.out.println("The triangle is not valid");
//        }
//        ==========================================================================================================
//        Write a program that ask the user to enter a year and checks if the year entered is a leap year or not.
//        ==========================================================================================================
//        System.out.println("Enter a year");
//        int year = sc.nextInt();
//        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
//            System.out.println("The year " + year + " is a leap year");
//        }else{
//            System.out.println("The year " + year + " is not a leap year");
//        }
//        ==========================================================================================================
//        Write a program that calculates the monthly telephone bills as per the following rule:
//        Minimum Rs. 200 for up to 100 calls
//        Plus Rs. 0.60 per call for next 50 calls
//        Plus Rs. 0.50 per call for next 50 calls
//        Plus Rs. 0.40 per call for any call beyond 200 calls
//        ==========================================================================================================
        System.out.println("How many calls have you used");
        int calls = sc.nextInt();


    }
}
