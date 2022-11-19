package com.java.class18;

import java.util.Scanner;

public class DiamondPatternSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows you want to have in your diamond");
        int row = sc.nextInt();

        for(int i = 1; i <= row / 2 - 1; i++){

            for(int sp = 1; sp <= row - i; sp++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = row / 2; i >= 1; i--){

            for(int sp = 1; sp <= row - i; sp++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
