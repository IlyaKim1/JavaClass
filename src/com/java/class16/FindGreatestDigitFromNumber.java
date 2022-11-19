package com.java.class16;

import java.util.Scanner;

public class FindGreatestDigitFromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int lastD = 0;
        int max = num % 10;

        while (num != 0) {
            lastD = num % 10;
            if (max < lastD) {
                max = lastD;
            }
            num = num / 10;
        }
        System.out.println("The greatest number is: " + max);

    }
}