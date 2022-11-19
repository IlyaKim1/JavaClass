package com.java.class08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class aHW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please put in your character: ");
        char c = sc.next().charAt(0);
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
            System.out.println("This is a vowel");
        }else{
            System.out.println("This is not a vowel");
        }
    }
}
