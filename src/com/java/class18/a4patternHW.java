package com.java.class18;

public class a4patternHW {
    public static void main(String[] args) {

        for(int i = 1; i <= 4; i++){
            int num = 0;
            for(int sp = 1; sp <= 5 - i; sp++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                num++;
                System.out.print(num);
            }

            System.out.println();
        }

        for(int i = 1; i <= 5; i++){
            int num = 0;

            for(int sp = 1; sp <= i - 1; sp++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 11 - 2 * i; j++){
                num++;
                System.out.print(num);
            }

            System.out.println();
        }

    }

}
