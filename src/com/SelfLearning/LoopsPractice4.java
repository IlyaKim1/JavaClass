package com.SelfLearning;

import java.util.Scanner;

public class LoopsPractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ====================================================================================================
//        Write a program to enter the numbers till the user wants and at the end it should display the count
//        of positive, negative and zeros entered.
//        ====================================================================================================
//        String yn;
//        int posCount = 0;
//        int negCount = 0;
//        int zeroCount = 0;
//
//        do{
//            System.out.println("Enter a number");
//            int num = sc.nextInt();
//            if(num > 0){
//                posCount++;
//            }else if(num < 0){
//                negCount++;
//            }else{
//                zeroCount++;
//            }
//
//            System.out.println("Do you want to enter another one? Press Y/N");
//            yn = sc.next();
//
//        }while(yn.equalsIgnoreCase("Y"));
//
//        System.out.println("Positive numbers entered: " + posCount);
//        System.out.println("Negative numbers entered: " + negCount);
//        System.out.println("Zeros entered: " + zeroCount);

//        ====================================================================================================
//        Write a program to enter the numbers till the user wants and at the end the program should display
//        the largest and smallest numbers entered.
//        ====================================================================================================

//        String yn;
//        int num;
//        int big = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
//
//        do{
//            System.out.println("Enter a number");
//            num = sc.nextInt();
//
//            if(num > big){
//                big = num;
//
//            }if(num < small){
//                small = num;
//            }
//
//            System.out.println("Do you want to enter another number? Y/N");
//            yn = sc.next();
//        }while(yn.equalsIgnoreCase("Y"));
//        System.out.println("The biggest number you entered was: " + big);
//        System.out.println("The smallest number you entered was: " + small);

//        ====================================================================================================
//        Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit
//        of the number is equal to the number itself, then the number is called an Armstrong number.
//        For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
//        ====================================================================================================

//        int digit1, digit2, digit3;
//
//        for (int i = 1; i <= 500; i++) {
//            int temp = i;
//            digit1 = temp % 10;
//
//            temp = temp / 10;
//            digit2 = temp % 10;
//
//            temp = temp / 10;
//            digit3 = temp % 10;
//
//            if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == i){
//                System.out.println(i + " is an Armstrong number");
//            }
//        }
//
//        ====================================================================================================
//        Write a program to print Fibonacci series of n terms where n is input by user :
//        0 1 1 2 3 5 8 13 24 .....
//        ====================================================================================================

//        System.out.println("Enter a number of series of Fibonacci sequences you want to get:");
//        int n = sc.nextInt();
//
//        int f1 = 0, f2 = 1, f3;
//
//        System.out.print(f1 + " " + f2 + " ");
//        for(int i = 3; i <= n; i++){
//
//            f3 = f1 + f2;
//            System.out.print(f3 + " ");
//            f1 = f2;
//            f2 = f3;
//
//        }

//        ====================================================================================================
//        Write a program to calculate the sum of following series where n is input by user.
//        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
//        ====================================================================================================

//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        double save = 0;
//
//        for(int i = 1; i <= num; i++){
//            save += 1.0 / i;
//        }
//        System.out.println(save);

//        ====================================================================================================
//        Compute the natural logarithm of 2, by adding up to n terms in the series
//        1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
//        where n is a positive integer and input by user.
//        ====================================================================================================

//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        double sum = 0;
//
//        for (int i = 1; i <= num; i++) {
//            if(i % 2 == 0){
//                sum -= 1.0 / i;
//            }else{
//                sum += 1.0 / i;
//            }
//        }
//        System.out.println(sum);

//        ====================================================================================================
//        Write a program that generates a random number and asks the user to guess what the number is.
//        If the user's guess is higher than the random number, the program should display "Too high,
//        try again." If the user's guess is lower than the random number, the program should display
//        "Too low, try again." The program should use a loop that repeats until the user correctly guesses
//        the random number.
//        ====================================================================================================

//        int num;
//        int numToGuess = 123;
//        do{
//            specialLine();
//            System.out.println("Guess the number");
//            specialLine();
//            num = sc.nextInt();
//
//            if(num > numToGuess){
//                lineOfEquals();
//                System.out.println("Your number is too high, try again!");
//                lineOfEquals();
//                skipLine();
//            }else if(num < numToGuess){
//                lineOfEquals();
//                System.out.println("Your number is too low, try again!");
//                lineOfEquals();
//                skipLine();
//            }else if(num == numToGuess){
//                specialLine();
//                System.out.println("You got it!!!");
//                specialLine();
//            }
//
//        }while(num != numToGuess);

//        ====================================================================================================
//        Write a program to print following :
//        ====================================================================================================
        System.out.println("1) ");
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 10; j++){

                System.out.print("*");
            }
            System.out.println();
        }
        skipLine();
        System.out.println("2) ");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
        skipLine();
        System.out.println("3) ");
        for(int i = 1; i <= 5; i++){
            for(int sp = 1; sp <= 5 - i; sp++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        skipLine();
        System.out.println("4) ");
        for(int i = 1; i <= 5; i++){
            for(int sp = 1; sp <= 5 - i; sp++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        skipLine();
        System.out.println("5) ");
        for(int i = 1; i <= 5; i++){
            for(int sp = 1; sp <= 5 - i; sp++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        skipLine();
        System.out.println("6) ");
        for(int i = 1; i < 7; i++){
            for(int s = 7 - i; s > 1; s--){
                System.out.print(" ");
            }
            for(int j = i; 1 <= j; j--){
                System.out.print(j);
            }
            for(int k = 2; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }







    }
    static void lineOfEquals () {
        System.out.println("=========================================");
    }
    static void specialLine () {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    static void skipLine () {
        System.out.println("\n");
    }
}

