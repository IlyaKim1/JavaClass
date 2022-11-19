package com.java.class02;

public class aHW1 {
    public static void main(String[] args) {
        System.out.println(14 % 5);
        System.out.println(21 % 6);
        System.out.println(73 % 2);
        System.out.println(40 % 7);
        System.out.println(16 % 1);
        System.out.println(80 % 8);
        System.out.println(92 % 9);
        System.out.println(77 % 5);

        divider();

        System.out.println(12 + 8 / 3 + 4 / 2 - 3);
        System.out.println(16 * 10 / (1 + 4) / 2 * 3);
        System.out.println(2 * 4 * (3 + 4) / (2 * 3));
        System.out.println(5 * 2 / 10 + 6 / 6 * 6);

        divider();

        int a = 1, b = -1;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println(a == b);


    }
    static void divider(){
        System.out.println("============================");
    }
}
