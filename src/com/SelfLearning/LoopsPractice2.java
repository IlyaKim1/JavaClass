package com.SelfLearning;

import java.util.Scanner;

public class LoopsPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ===========================================================================================================
//        Write a program to print numbers from 1 to 10.
//        ===========================================================================================================
//        int a = 0;
//        while(a < 10){
//            a++;
//            System.out.println(a);
//        }
//        ===========================================================================================================
//        Write a program tp calculate the sum of first 10 natural numbers.
//        ===========================================================================================================
//        int a = 0;
//        int sum = 0;
//        while(a < 10){
//            a++;
//            sum += a;
//        }
//        System.out.println(sum);
//        ===========================================================================================================
//        Write a program that prompts the user to input a positive integer. It should the print the multiplication
//        table of that number.
//        ===========================================================================================================
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        int result = 0;
//        int mul = 0;
//        while(mul < 10){
//            mul++;
//            result = num * mul;
//            System.out.println(num + " x " + mul + " = " + result);
//        }
//        ===========================================================================================================
//        Write a program to find the factorial value of any number entered through the keyboard.
//        ===========================================================================================================
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        int fact = 1;
//        while(num > 0){
//            fact *= num;
//            num--;
//        }
//        System.out.println(fact);
//        ===========================================================================================================
//        Two numbers are entered though the keyboard. Write a program to find the value of the number raised to the
//        power of another.
//        ===========================================================================================================
//        System.out.println("Enter a base number");
//        int base = sc.nextInt();
//        System.out.println("Enter the power");
//        int power = sc.nextInt();
//        int result = 1;
//
//        while(power > 0){
//            result *= base;
//            power--;
//
//
//        }
//        System.out.println(result);
//        ===========================================================================================================
//        Write a program that prompts the user to input an integer and then outputs the number with the digits
//        reversed. For example, if the input is 12345 the output should be 54321.
//        ===========================================================================================================
//        System.out.println("Enter a number ");
//        int num = sc.nextInt();
//        int lastDigit;
//
//
//        while(num > 0){
//            lastDigit = num % 10;
//            num = num / 10;
//            System.out.println(lastDigit);
//        }
//        ===========================================================================================================
//        Write a program that reads a set of integers, and then prints the sum of odd and even integers.
//        ===========================================================================================================
//        int num;
//        boolean choice;
//        int sumEven = 0;
//        int sumOdd = 0;
//
//        do{
//
//            System.out.println("Enter a number");
//            num = sc.nextInt();
//            if(num % 2 == 0){
//                sumEven += num;
//            }else if(num % 2 > 0){
//                sumOdd += num;
//            }
//
//            System.out.println("Do you want to enter more numbers?");
//            choice = sc.nextBoolean();
//
//        }while(choice);
//
//        System.out.println("The sum of odd numbers you entered: " + sumOdd);
//        System.out.println("The sum of even numbers you entered: " + sumEven);
//        ===========================================================================================================
//        Write a program that prompts the user to input a positive integer. It should then output a message
//        indicating whether the number is a prime number.
//        ===========================================================================================================

        int number;

        System.out.print("Enter the positive integer ");
        number = sc.nextInt();

        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag && number > 1) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}



