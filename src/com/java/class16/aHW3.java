package com.java.class16;

public class aHW3 {
    public static void main(String[] args) {

        int sec = 2;
        double result = 0;
        double sum = 0;

        for(int i = 1; i <= 10; i++){
            result = (double)i / sec;
            sum += result;
            sec++;
        }
        System.out.println(sum);
    }
}
