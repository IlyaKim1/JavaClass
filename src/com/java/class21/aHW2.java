package com.java.class21;

import com.sun.nio.file.SensitivityWatchEventModifier;

import java.util.Scanner;

public class aHW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String str = sc.nextLine();

        removeWhiteSpaces(str);
    }

    static void removeWhiteSpaces(String sen){
        System.out.println(sen.replace(" ", ""));
    }
}
