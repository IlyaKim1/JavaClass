package com.java.class16;

import java.util.Scanner;

public class aHW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find its factors");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                lineOfEquals();
                System.out.println(i);
                lineOfEquals();
            }
        }


    }
    static void lineOfEquals(){
        System.out.println("================");
    }

}