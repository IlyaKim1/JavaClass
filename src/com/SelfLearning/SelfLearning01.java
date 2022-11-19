package com.SelfLearning;

public class SelfLearning01 {
    public static void main(String[] args) {
        System.out.println("Hello, World!!");
        String my = "My name is";
        String firstname = "Ilya";
        String lastname = "Kim";
        String str1 = "Batir";
        String str2 = " Eban";
        char space = ' ';
        char comma = ',';
        char dot = '.';
        String fullname = my + space + firstname + space + lastname + dot;
        System.out.println(fullname);

        String whoisit = "I am a new SDET course student";
        String action = "and I am writing my first programm on my own";

        String description = whoisit + comma + space + action + dot;
        System.out.println(description);


        String q1 = "I like working with Java very much";
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(q1);
        System.out.println(b1);
        String q2 = "I was told to do it";
        System.out.println(q2);
        System.out.println(b2);
        String q3 = "I do it because practice makes perfect";
        System.out.println(q3);
        System.out.println(b1);
        String q4 = "I'm done for now";
        System.out.println(q4);
        System.out.println(b1);

        String bye = "Bye, World!!";
        System.out.println(bye);
        int num1 = 5, num2 = 10;
        System.out.println(num2 % num1);
        System.out.println(str1 + str2);
// By default, java will consider a whole number as int and any decimal number as a double
        System.out.println(12 * 2 / 6 * (2 + 6 / 10) - 20 * (3 - 8));
        System.out.println(12 / 24.0 * 6 + 4);
        System.out.println(10 * 5 / 20 + "Hello" + 12 * 5);






    }
}
