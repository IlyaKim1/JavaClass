package com.java.class09;

import java.util.Scanner;

public class aHW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your units by numbers from 1 - 600");
        double unit = sc.nextInt();
        double rsU = 0;
        double rs = 0;

        if (unit <= 0) {
            System.out.println("Please enter units in numbers 1 - 600 only");
        } else if (unit <= 200) {
            System.out.println ("The amount you have to pay is: " + (unit * 0.5));
        } else if (unit <= 400) {
            System.out.println ("The amount you have to pay is: " + (100 + unit * 0.65));
        } else if (unit <= 600) {
            System.out.println ("The amount you have to pay is: " + (230 + unit * 0.8));
        } else {
            System.out.println ("Please enter units in numbers 1 - 600 only");
        }

    }
}

