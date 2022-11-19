package com.java.class10;

import java.util.Scanner;

public class aHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number using digits from 100 to 999 only");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999){
            int calc1 = num % 10;
            int calc2 = (num % 100) / 10;
            int calc3 = num / 100;
            System.out.println("The result is: " + calc1 + calc2 + calc3);
        }else{
            System.out.println("Please enter a valid number");
        }
    }
}
