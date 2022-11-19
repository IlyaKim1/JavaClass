package com.java.class03;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        System.out.println(10 % 3); //Answer is 1
        System.out.println(15 % 4); //Answer is 3

        System.out.println(15 % 2); //Answer is 1
        System.out.println(20 % 2); //Answer is 0
        System.out.println(26 % 2); //Answer is 0
        System.out.println(13 % 2); //Answer is 1

        //7 cannot be devided by 10, so the answer is 7
        System.out.println(7 % 10); //Answer is 7

        //The last digit is the answer
        System.out.println(15 % 10); //Answer is 5
        System.out.println(67 % 10); //Answer is 7
        System.out.println(133 % 10); //Answer is 3
        System.out.println(265 % 10); //Answer is 5

        //Remove the last digit from the number
        System.out.println(15 % 10); //Answer is 1
        System.out.println(67 % 10); //Answer is 6
        System.out.println(133 % 10); //Answer is 13
        System.out.println(265 % 10); //Answer is 26



    }

}
