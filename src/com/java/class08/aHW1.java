package com.java.class08;

import java.util.Scanner;

public class aHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int num1 = sc.nextInt();
        int five = num1 % 5;
        if(five == 0){
            System.out.println("This number is divisible by 5");
        }else{
            System.out.println("This number is not divisible by 5");
        }
    }
}
