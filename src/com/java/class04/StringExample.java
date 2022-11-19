package com.java.class04;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " Everyone";
        String str3 = "Batir";
        String str4 = " Eban";
        int num1 = 10;
        int num2 = 20;
        double d = 10.1;


        System.out.println(str1 + str2);
        System.out.println(str1 + num1);
        System.out.println(str1 + num1 + num2);
        System.out.println(str1 + (num1 + num2));
        System.out.println(str1 + num1 * num2);
        System.out.println(str1 + num1 + num2 + str2);
        // System.out.println(str1 + num1 - num2); //Cannot do subtraction from String and int
        System.out.println(num1 + "num2" + str1);
        System.out.println(str3 + str4);

    }
}
