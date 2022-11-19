package com.java.class17;

import java.util.Scanner;

public class InClassAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();



        for(int i = 1; i <= 5; i++){

            for(int s = 1; s <= 5 - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                System.out.print("A");
            }
            System.out.println();
        }

        for(int i = 1; i <= 4; i++){

            for(int s = 1; s <= 4 - i; s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
