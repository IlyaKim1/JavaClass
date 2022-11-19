package com.java.LateHomeworks;

import java.util.Scanner;

public class InitialsHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = sc.nextLine();

        getInitials(name);


    }
    static void getInitials (String name){

        int sp = name.indexOf(" ");
        System.out.println(name.charAt(0) + "." + name.charAt(sp + 1));
    }
}
