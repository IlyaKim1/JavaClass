package com.java.class20;

import java.util.Scanner;

public class InClassStringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence to know its size");
        String org = sc.nextLine();
        System.out.println("\n");
        getNumberOfSpaces(org);

    }
    static int getNumberOfSpaces(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        if(count < 5){
            System.out.println("The string is small");
        }else if(count >= 5 && count < 10){
            System.out.println("The string is medium");
        }else{
            System.out.println("The string is large");
        }
        return count;
    }
}
