package com.java.class23;

public class aHW1 {
    public static void main(String[] args) {
        System.out.println("Go through and write the same code by yourself from the file TwoDimensionArray.java");

        int[][] num = {{21, 25, 38}, {56, 63, 47}, {89, 70, 58}};

        for (int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
}