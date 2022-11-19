package com.java.LateHomeworks;

public class IntroToArraysHW {

    public static void main(String[] args) {


        int[] arr = {23, 44, 21, 56, 27, 35, 75, 34, 25};

        lineOfEquals();
        sumOfOddAndEven(arr);
        lineOfEquals();
//        ====================================================================================
        System.out.println("\n");
        lineOfEquals();
        System.out.println("The greatest number in the array is: " + greatestNum(arr));
        lineOfEquals();

    }
    static int greatestNum (int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    res = arr[i] = arr[j];
                }
            }

        }
        return res;
    }

    static void sumOfOddAndEven(int[] arr){
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenSum += arr[i];
            }else{
                oddSum += arr[i];
            }
        }
        System.out.println("Sum of all the even numbers in the array is: " + evenSum);
        System.out.println("Sum of all the odd numbers in the array is: " + oddSum);
    }
    static void lineOfEquals(){
        System.out.println("==========================================================");
    }

}
