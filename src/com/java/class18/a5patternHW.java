package com.java.class18;

public class a5patternHW {
    public static void main(String[] args) {

        for(int i = 1; i <= 4; i++){
            for(int sp = 1; sp <= 5 - i; sp++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                if(i % 2 == 0) {
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= 5; i++){
            for(int sp = 1; sp <= i - 1; sp++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 11 - 2 * i; j++){
                if(i % 2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }

            System.out.println();
        }

    }
}
