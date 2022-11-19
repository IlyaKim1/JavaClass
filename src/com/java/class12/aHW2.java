package com.java.class12;

import java.util.Scanner;

public class aHW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a whole number: ");
        int num = sc.nextInt();
        checkIfEven(num);
    }

    static void checkIfEven(int num){
        if(num% 2 == 0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }


    }
}