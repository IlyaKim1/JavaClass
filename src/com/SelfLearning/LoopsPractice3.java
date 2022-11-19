package com.SelfLearning;

import java.util.Scanner;

public class LoopsPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ==========================================
//        Write a program to find HCF of two numbers
//        ==========================================

        String cont;
//
//        do {
//
//            System.out.println("Enter first positive number: ");
//            int num1 = sc.nextInt();
//            System.out.println("Enter second positive number");
//            int num2 = sc.nextInt();
//            int res = 0;
//
//
//            for (int i = 1; i <= num1; i++) {
//                if (num1 % i == 0 && num2 % i == 0) {
//                    res = i;
//                }
//            }
//            lineOfEqualSigns();
//            System.out.println("The HCF of numbers " + num1 + " and " + num2 + " is: " + res);
//            lineOfEqualSigns();
//            System.out.println("\n");
//            lineOfEqualSigns();
//            System.out.println("Press +/- to continue or stop");
//            lineOfEqualSigns();
//            cont = sc.next();
//
//        } while (cont.equals("+"));
//        lineOfEqualSigns();
//        System.out.println("Come back anytime!");
//        lineOfEqualSigns();


//        ================================================================================================================
//        Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed.
//        The loop should ask the user whether he or she wishes to perform the operation again. If so,
//        the loop should repeat; otherwise it should terminate.
//        ================================================================================================================


        do {

            System.out.print("Enter your first number: ");
            int num1 = sc.nextInt();
            System.out.print("\n" + "Enter your second number: ");
            int num2 = sc.nextInt();

            lineOfEqualSigns();
            System.out.println("The sum of numbers " + num1 + " and " + num2 + " is: " + (num1 + num2));
            lineOfEqualSigns();

            System.out.println("\n");
            lineOfEqualSigns();
            System.out.println("Press Y/N if you wish to continue or stop: ");
            lineOfEqualSigns();
            cont = sc.next();

        }while(cont.equalsIgnoreCase("Y"));
    }
    static void lineOfEqualSigns(){
        System.out.println("===============================================");
    }

}
