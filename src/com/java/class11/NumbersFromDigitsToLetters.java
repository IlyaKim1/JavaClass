package com.java.class11;

import java.util.Scanner;

public class NumbersFromDigitsToLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Please enter a number 0 - 5");

        if (num == 0){
            System.out.println("Zero");
        }else if (num == 1){
            System.out.println("One");
        }else if (num == 2){
            System.out.println("Two");
        }else if (num == 3){
            System.out.println("Three");
        }else if (num == 4){
            System.out.println("Four");
        }else if (num == 5){
            System.out.println("Five");
        }else{
            System.out.println("OnPlease enter numbers 0 - 5 only");
        }
    }
}
