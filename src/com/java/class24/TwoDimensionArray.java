package com.java.class24;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] arr = {{12, 13, 15},{23, 24, 25},{34, 35, 36}};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
