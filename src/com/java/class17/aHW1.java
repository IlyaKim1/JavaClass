package com.java.class17;

import java.util.Scanner;

public class aHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number of rows you want the pattern to have");
        int row = sc.nextInt();



        for(int i = 1; i <= row; i++){

            for(int s = i; s <= row; s++){
                System.out.print(" ");
            }
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 1; a < row; a++){

            for(int s = 1; s <= a + 1; s++){
                System.out.print(" ");
            }
            for(int b = row; b > a; b--){
                System.out.print("*");
            }
            for(int c = a; c < row - 1; c++){
                System.out.print("*");
            }


            System.out.println();
        }


    }
}
