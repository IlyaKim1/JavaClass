package com.java.class24;

public class SumOfElementRowWise {
    public static void main(String[] args) {
        int[][] arr = {{23, 44, 21}, {45, 42, 31}, {73, 14, 0}};
        int sum;

        for(int i = 0; i< arr.length; i++){
            sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }

//        for (int[] a : arr) {
//            sum = 0;
//            for (int i : a) {
//                sum += i;
//            }
//            System.out.println(sum);
//        }
    }
}

