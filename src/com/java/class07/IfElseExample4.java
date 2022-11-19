package com.java.class07;

import java.util.Scanner;

public class IfElseExample4 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("Enter your grade: ");
        int g = cs.nextInt();

            if (g > 100){
                System.out.println("You're not that smart");
            }else if (g < 0){
                System.out.println("Enter a valid grade");
            }else if (g >= 90){
                System.out.println("A+");
            }else if (g >= 80){
                System.out.println("A");
            }else if (g >= 70){
                System.out.println("B+");
            }else if (g >= 60){
                System.out.println("B");
            }else if (g >= 50){
                System.out.println("C+");
            }else if (g >= 40){
                System.out.println("C");
            }else{
                System.out.println("FAIL");
            }

        }
    }
