package com.java.class19;

public class HW2 {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 5; j >= 2; j--) {
                if (i % j == j - 1) {
                    count++;
                }
            }
            if(count == 4){
                System.out.println(i);
            }
        }


    }
}
