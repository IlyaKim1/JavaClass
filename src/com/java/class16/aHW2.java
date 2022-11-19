package com.java.class16;

public class aHW2 {
    public static void main(String[] args) {

        int sum = 0;
        int add = 1;
        int result = 0;

        for(int i = 10; i >= 6; i--) {
            sum  = i + add;
            result += sum;
            add++;
        }
        System.out.println(result);

    }
}
