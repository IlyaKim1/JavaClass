package com.java.class05;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Put your first line here ");
        String str1 = a.nextLine();
        System.out.println("Put your second line here ");
        String str2 = a.nextLine();
        String str3;

        str3 = str1;
        str1 = str2;
        str2 = str3;

        System.out.println(str1 + ' ' + str2);


    }
}
