package com.java.class17;

import java.util.Scanner;

public class PatternWithForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num/2+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
        for (int i = 1; i < num/2 + 1; i++) {
            for (int j = num/2; j >= i; j--) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}