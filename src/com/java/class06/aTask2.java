package com.java.class06;

import java.util.Scanner;

public class aTask2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter your principal");
        double p = sc.nextDouble();
        System.out.println("Please enter your interest rate");
        double i = sc.nextDouble();
        System.out.println("Please enter the number of years");
        double y = sc.nextDouble();

        double oi = p * i * y / 100;
        System.out.println("Your interest: " + oi + "$");

        if(oi >= 20000) {
            System.out.println("Total you will pay by the end of the loan: " + (p + oi) + "$");
            System.out.println("Do you really need it that bad?");
        }else{
            System.out.println("Total you will pay by the end of the loan: " + (p + oi) + "$");
        }




    }
}
