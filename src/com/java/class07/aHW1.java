package com.java.class07;

import java.util.Scanner;

public class aHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        double num = sc.nextDouble();

        if(num == 0){
            System.out.println("Zero");
        }else if(num < 0){
            System.out.println("Negative");
        }else if(num > 0){
            System.out.println("Positive");
        }

    }
}
