package com.java.class25;

public class printArrayUsingForEach {
    public static void main(String[] args) {
        int[][] arr = {{23, 24}, {25, 26}, {27, 28}, {29, 30}};

        for (int[] a : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }



    }
}
