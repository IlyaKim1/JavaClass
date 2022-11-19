package com.SelfLearning;

import java.util.Scanner;

public class LoopsPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ============================================================
//        Write a program that prints out all the numbers from 1 to 10
//        ============================================================
//
//        for (int a = 1; a <= 10; a++) {
//            System.out.println(a);
//       }

//        ===============================================================================
//        Write a program that calculates the sum of all the natural numbers from 1 to 10
//        ===============================================================================
//
//        int sum = 0;
//        for(int b = 1; b <= 10; b++){
//            sum += b;
//        }
//        lineOfEqualSigns();
//        System.out.println("The sum of natural numbers from 1 to 10 is equal to: " + sum);
//        lineOfEqualSigns();
//
//        ===============================================================================
//        Write a program that prompts the user to input a positive integer. It should
//        then print the multiplication table of that number.
//        ===============================================================================
//
//        lineOfEqualSigns();
//        System.out.println("Please input a positive integer: ");
//        lineOfEqualSigns();
//        int c = sc.nextInt();
//        lineOfEqualSigns();
//        System.out.println("Multiplication table of " + c);
//        lineOfEqualSigns();
//        for(int i = 1; i <= 10; i++){
//            System.out.println(c + " x " + i + " = " + (c * i));
//        }
//
//        ===============================================================================
//        Write a program to find the factorial value of any number entered through the
//        keyboard.
//        ===============================================================================
//
//        lineOfEqualSigns();
//        System.out.println("Enter any positive number that you want to find the factorial of: ");
//        lineOfEqualSigns();
//        int d = sc.nextInt();
//
//        int fact = 1;
//        for(int i = 1; i <= d; i++){
//            fact *= i;
//        }
//        lineOfEqualSigns();
//        System.out.println("The factorial of number " + d + " is: " + fact);
//        lineOfEqualSigns();
////
//        ===============================================================================
//        Two numbers are entered through the keyboard. Write a program to find the value
//        of one number raised to the power of another.
//        ===============================================================================

//        lineOfEqualSigns();
//        System.out.println("Enter the number which power you want to raise: ");
//        lineOfEqualSigns();
//        int num1 = sc.nextInt();
//        lineOfEqualSigns();
//        System.out.println("Enter the number which power you want the first number to raise to: ");
//        lineOfEqualSigns();
//        int num2 = sc.nextInt();
//
//        int result = 1;
//        for(int i = 1; i <= num2; i++){
//            result *= num1;
//        }
//        lineOfEqualSigns();
//        System.out.println("Result is: " + result);
//        lineOfEqualSigns();
//
//        ===============================================================================
//        Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed. For example, if the input is 12345, the output
//        should be 54321.
//        ===============================================================================

//        System.out.println("Print the number you want to reverse: ");
//        int num = sc.nextInt();
//        int rev = 0;
//        int temp = num;
//        int remainder = 0;
//
//        while(temp > 0){
//            remainder = temp % 10;
//            rev = rev * 10 + remainder;
//            temp /= 10;
//        }
//        System.out.println("Reverse of " + num + " is " + rev);

//        ===============================================================================
//        Write a program that reads a set of integers, and then prints the sum of the
//        even and odd integers.
//        ===============================================================================

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do
        {
            System.out.print("Enter the number ");
            number = sc.nextInt();

            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);




    }
    static void lineOfEqualSigns(){
        System.out.println("==========================================================");
    }


}



