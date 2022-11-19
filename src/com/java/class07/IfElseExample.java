package com.java.class07;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
      /*  1. Input
          2. Output
          3. Logic
          "sout" = shortcut for System.out.,println  */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        double d1 = sc.nextDouble();
        System.out.println("Please enter your second number: ");
        double d2 = sc.nextDouble();

        if(d1 >= d2){
            System.out.println("The bigger number out of two is: " + d1);
        }else{
            System.out.println("The bigger number out of two is: " + d2);
        }





    }
}
