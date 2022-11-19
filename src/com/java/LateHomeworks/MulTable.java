package com.java.LateHomeworks;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        lineOfEquals();
        System.out.println("Enter a number to se it's multiplication table:");
        lineOfEquals();
        int num = sc.nextInt();
        multiplicationTable(num);
        lineOfEquals();
//      =============================================================================================================
        System.out.println("All the numbers that are divisible by 3 between 1 and 20");
        lineOfEquals();
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
        lineOfEquals();
        System.out.println("Program to print the pattern: 1 10 2 9 3 8 4 7 5 6");
        lineOfEquals();
        int rev = 11;
        for(int i = 1; i < 6; i++){
            System.out.print(i + " ");
            rev--;
            System.out.print(rev + " ");

        }

    }


    static void multiplicationTable(int num){
        int res;
        for(int i = 1; i <= 9; i++){
            res = i * num;
            System.out.println(num + " x " + i + " = " + res);
        }
    }
    static void lineOfEquals(){
        System.out.println("========================================================");
    }
}
