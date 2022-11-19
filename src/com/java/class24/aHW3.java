package com.java.class24;

public class aHW3 {
    public static void main(String[] args) {

        int[] num = {5, 2, 8, 7, 3, 6};
        int store;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    store = num[i];
                    num[i] = num[j];
                    num[j] = store;

                }
            }
        }
        for (int a : num) {
            System.out.print(a);
        }
    }
}