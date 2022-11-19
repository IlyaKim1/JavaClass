package com.java.class17;

public class NestedForLoopExamples {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
        }
            System.out.println();
        }
        for(int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5 - a; b++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
