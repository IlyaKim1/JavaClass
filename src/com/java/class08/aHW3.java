package com.java.class08;

import java.util.Scanner;

public class aHW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your company's rating from 1 - 5: ");
        int rate = sc.nextInt();

        if(rate == 5){
            System.out.println("Very Good!");
        }else if(rate == 4){
            System.out.println("Good!");
        }else if(rate == 3){
            System.out.println("Average");
        }else if(rate == 2){
            System.out.println("Poor");
        }else if(rate == 1){
            System.out.println("Very Poor");
        }else{
            System.out.println("Please only enter numbers from 1 - 5");
        }
    }
}
