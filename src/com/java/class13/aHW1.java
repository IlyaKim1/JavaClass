package com.java.class13;

import java.util.Scanner;

public class aHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Write a program that takes temperature from the user in Celsius and converts it to Fahrenheit
//        using method

        System.out.println("Please enter temperature in Celsius: ");
        double temp = sc.nextInt();
        System.out.println("The conversion of " + temp + "C° to Fahrenheit is equal to: " + convert(temp) + "F°");
    }
    static double convert(double temp){
        return temp * 9 / 5 + 32;
    }
}
