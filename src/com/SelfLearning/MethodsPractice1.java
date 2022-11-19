package com.SelfLearning;

import java.util.Scanner;

public class MethodsPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("The sum of the numbers you entered is: " + sumOfTwo(num1, num2));
//      ====================================================================================================
        System.out.println();
//      ====================================================================================================
        System.out.println("Enter a number to check is it's even or not");
        int eOrNot = sc.nextInt();
        if(isEven(eOrNot)){
            System.out.println("The number " + eOrNot+ " is even");
        }else{
            System.out.println("The number " + eOrNot + " is odd");
        }
//      ====================================================================================================
        System.out.println();
//      ====================================================================================================
        System.out.println("Enter a String");
        String str = sc.next();
        System.out.println("The number of vowels in your String is: " + isVowel(str));
//      ====================================================================================================
        System.out.println();
//      ====================================================================================================
    }

    static int sumOfTwo(int a, int b){
        return a + b;
    }

    static boolean isEven(int check){
        return check % 2 == 0;
    }

    static int isVowel(String word){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'A' || word.charAt(i) == 'a' || word.charAt(i) == 'O' || word.charAt(i) == 'o' || word.charAt(i) == 'U' || word.charAt(i) == 'u' || word.charAt(i) == 'E' || word.charAt(i) == 'e' || word.charAt(i) == 'I' || word.charAt(i) == 'i'){
                count++;
            }
        }
        return count;
    }
}
