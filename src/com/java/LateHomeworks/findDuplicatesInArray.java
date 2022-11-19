package com.java.LateHomeworks;

public class findDuplicatesInArray {
    public static void main(String[] args) {


        int[] arr = {23, 44, 21, 23, 27, 35, 75, 44, 25};

        System.out.println("Duplicates");
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }


    }
}