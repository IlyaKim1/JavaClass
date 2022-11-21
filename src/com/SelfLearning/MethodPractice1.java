package com.SelfLearning;

import java.util.Scanner;

public class MethodPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter your third number: ");
        int num3 = sc.nextInt();

        lineOfEqualSigns();
        System.out.println("The sum of numbers: " + num1 + ", " + num2 + ", " + num3 + " is equal to: " + sumOfNumbers(num1, num2, num3));
        lineOfEqualSigns();
        System.out.println("The multiplication of numbers: " + num1 + ", " + num2 + ", " + num3 + " is equal to: " + multiplicationOfNumbers(num1, num2, num3));
        lineOfEqualSigns();
        System.out.println("The average of numbers: " + num1 + ", " + num2 + ", " + num3 + " is equal to: " + averageOfNumbers(num1, num2, num3));
        lineOfEqualSigns();
        System.out.println("The greatest number out of numbers: " + num1 + ", " + num2 + ", " + num3 + " is: " + greatestNumber(num1, num2, num3));
        lineOfEqualSigns();




    }
    static void lineOfEqualSigns(){
        System.out.println("=======================================================================");
    }
    static int sumOfNumbers(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
    static int multiplicationOfNumbers(int a, int b, int c){
        int mul = a * b * c;
        return mul;
    }
    static int averageOfNumbers(int a, int b, int c){
        int average = (a + b + c) / 3;
        return average;
    }
    static int greatestNumber(int a, int b, int c){
        int greatest = 0;
        if(a > b && a > c){
            greatest = a;
        }else if(b > c && b > a){
            greatest = b;
        }else{
            greatest = c;
        }
        return greatest;
    }

}
