package com.java.class16;

import java.util.Scanner;

public class FindLengthOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;



        while(num > 0){
            count++;
            num /= 10;
        }
        System.out.println("The length of your number is: " + count);
    }
}
