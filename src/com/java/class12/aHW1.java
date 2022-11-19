package com.java.class12;

import java.util.Scanner;

public class aHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first three digit number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second three digit number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your third three digit number: ");
        int num3 = sc.nextInt();
        int greatestNum = 0;
//        int calc1 = num1 % 10;
//        int calc2 = (num1 % 100) / 10;
//        int calc3 = num1 / 100;
//        System.out.println("The result is: " + calc1 + calc2 + calc3);


        if (num1 > num2) {
            if(num1 > num3){
                greatestNum = num1;
            }else{
                greatestNum = num3;
            }
        }else{
            if(num2 > num1){
                if(num2 > num3){
                    greatestNum = num2;
                }else{
                    greatestNum = num3;
                }
            }
        }

        int calc1 = greatestNum % 10;
        int calc2 = (greatestNum % 100) / 10;
        int calc3 = greatestNum / 100;
        System.out.println("The result is: " + calc1 + calc2 + calc3);




    }
}
