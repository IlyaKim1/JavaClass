package com.java.class13;

import java.util.Scanner;

public class aReDoOfHWFrom13thClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your third number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter your fourth number: ");
        int num4 = sc.nextInt();

//        int max1 = findMax(num1, num2);
//        int max2 = findMax(num3, num4);
//        System.out.println("Greatest number is " + findMax(max1, max2));

        System.out.println("Greatest number is " + findMax(findMax(num1, num2), findMax(num3, num4)));

    }
    static int findMax(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
}
