package com.java.class25;

import java.util.Scanner;

public class inClassAssignmentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();
        String[] words = str.split(" ");

        for(String word : words){
            System.out.println(word + " = " + word.length());
        }




    }
}
