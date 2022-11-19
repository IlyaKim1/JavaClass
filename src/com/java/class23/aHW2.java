package com.java.class23;

public class aHW2 {
    public static void main(String[] args) {

        int[] num = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        int count;

        for (int i = 0; i < num.length - 1; i++) {
            count = 0;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }
            if(count == 1){
                System.out.println(num[i]);
            }
        }


    }
}