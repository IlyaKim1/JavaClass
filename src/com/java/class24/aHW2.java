package com.java.class24;

public class aHW2 {
    public static void main(String[] args) {

        int[][] arr = {{23, 44, 21}, {45, 42, 31}, {73, 14, 0}};
        int sum = 0;



        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[j][i];
            }
            System.out.println(sum);
        }


    }
}
