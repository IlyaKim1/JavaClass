package com.java.class03;

public class ExpressionPriority {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 10;


        // (* / + - % =) are operators
        int result = 10 * 5 * 10 / 5 / 20 / 5 + 1;

        System.out.println(result);
    }
}
