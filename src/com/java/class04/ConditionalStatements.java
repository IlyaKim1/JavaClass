package com.java.class04;

public class ConditionalStatements {
    public static void main(String[] args) {
        int a =10;

        System.out.println("1"); //No restriction, so it will print it with no problem "1"

        if(a >= 11){ //Java will only print it out if the statement is true, this statement is false, so Java doesn't print it.
            System.out.println("2");
        }

        System.out.println("3"); //No restriction, so it will print it with no problem "3"
    }
}
