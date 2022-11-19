package com.java.class18;

public class aHW1 {
    public static void main(String[] args){
//        =========================================================
//        Program to print out all the prime numbers from 1 to 100.
//        =========================================================

        for(int i = 1; i <= 100; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
       }


    }
}
