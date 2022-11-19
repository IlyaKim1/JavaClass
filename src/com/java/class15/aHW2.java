package com.java.class15;

public class aHW2 {
    public static void main(String[] args) {
        int sum = 0;

        for(int a = 1; a <= 50; a++){
            if(a % 3 == 0 || a % 5 == 0){
                System.out.println(a);
                sum += a;
            }
        }
        System.out.println(sum);


    }
}
