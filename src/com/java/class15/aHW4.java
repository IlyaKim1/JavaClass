package com.java.class15;

import java.util.Scanner;

public class aHW4 {
    public static void main(String[] args) {

//        =======================================================================================
//        Write a program to print each digit of the number into a separate line in reverse order
//        =======================================================================================
        Scanner sc = new Scanner(System.in);

        lineOfEqualSigns();
        System.out.println("Please enter your number: ");
        lineOfEqualSigns();
        int num = sc.nextInt();

        while(num != 0){
            System.out.println(num % 10);
            num = num / 10;
        }

    }
    static void lineOfEqualSigns(){
        System.out.println("=========================");

    }
}
