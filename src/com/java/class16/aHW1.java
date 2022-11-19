package com.java.class16;

import java.util.Scanner;

public class aHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int lastD = 0;
        int sum = 0;

        while(num != 0){
            lastD = num % 10;
            if(lastD != 0){
                sum += lastD;
            }
            num /= 10;
        }
        System.out.println("The result is: " + sum);

    }

}
