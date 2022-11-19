package com.java.class24;

public class aHW1 {
    public static void main(String[] args) {

        int[] arr = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        int count;

        for(int i = 0; i < arr.length; i++){
            count = 0;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
