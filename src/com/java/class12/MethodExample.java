package com.java.class12;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printLineWithEqual(); //Method Call
        System.out.println("Welcome to the Calculator");
        printLineWithEqual(); //Method Call

        printLineWithHyphen(); //Method Call
        System.out.println("Please enter first number");
        printLineWithHyphen(); //Method Call
        int num1 = sc.nextInt();

        printLineWithHyphen(); //Method Call
        System.out.println("Please enter second number");
        printLineWithHyphen(); //Method Call
        int num2 = sc.nextInt();

        printLineWithEqual(); //Method Call
        System.out.println("Here's your addition: " + (num1 + num2));
        printLineWithEqual(); //Method Call
    }

    static void printLineWithEqual(){
        System.out.println("=====================================");
    }
    static void printLineWithHyphen(){
        System.out.println("-------------------------------------");
    }
}
