package com.java.class13;

import java.util.Scanner;

public class aHW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your third number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter your fourth number: ");
        int num4 = sc.nextInt();
        System.out.println(findTheGreatestNum(num1, num2, num3, num4) + " is the greatest number");


    }
    static int findTheGreatestNum(int a, int b, int c, int d) {
        int greatest = 0;
        if (a > b && a > c && a > d) {
            greatest = a;
        } else if (b > a && b > c && b > d) {
            greatest = b;
        } else if (c > a && c > b && c > d) {
            greatest = c;
        } else{
            greatest = d;
        }
        return greatest;
    }
}
