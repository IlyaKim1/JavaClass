package com.java.class21;

import java.util.Scanner;

public class aHW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence to check if its Palindrome or not");
        String str = sc.nextLine();

        checkIfPal(str);

    }
    static void checkIfPal(String sen){
        String orgS = sen;
        String rev = "";

        for(int i = 0; i < sen.length(); i++) {
            rev += sen.charAt(i);
        }
        if(rev.replace(" ", "").equalsIgnoreCase(orgS.replace(" ",""))){
            System.out.println("The sentence you entered is a Palindrome");
        }else {
            System.out.println("The sentence you entered is not a Palindrome");
        }
    }
}

