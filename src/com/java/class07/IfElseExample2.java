package com.java.class07;

import java.util.Scanner;

public class IfElseExample2 {
//highlight and ctrl + / to make it a line/s a statement
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You're eligible to have a driver's license");
        }else{
            System.out.println("You're not eligible to have a driver's license");
        }

    }
}
