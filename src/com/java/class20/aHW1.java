package com.java.class20;

import java.util.Scanner;

public class aHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = sc.nextLine();

        String initial = name.charAt(0) + ".";

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' '){
                initial = initial + name.charAt(i + 1) + ".";
            }
        }
        System.out.println(initial);
    }
}
