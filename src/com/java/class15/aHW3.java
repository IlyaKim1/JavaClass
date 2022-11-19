package com.java.class15;

public class aHW3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int a = 1; a <= 10; a++){
            if(a % 3 > 0){
                sum += a;
            }else{
                sum -= a;
            }
        }
        System.out.println(sum);
    }
}
