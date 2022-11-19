package com.java.class18;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      ========================================================
//      Write a program to find if a number is PALINDROME or not
//      ========================================================

        System.out.println("Enter a number");
        int num = sc.nextInt();
        int orgNum = num;
        int rev = 0;
        int lastD;


        while (num != 0) {
            lastD = num % 10;
            rev = rev * 10 + lastD;
            num /= 10;
        }

        if (orgNum == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }

}