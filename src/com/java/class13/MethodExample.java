package com.java.class13;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println(getMultiplication(10,20));
        System.out.println(call("100"));
        System.out.println(text("1233", "asdaf" ));
    }
    static int getMultiplication(int a, int b){
        int result = a * b;
        return result;
    }
    static String call(String phoneNumber){
        return "Calling... " + phoneNumber;
    }
    static String text(String phoneNumber, String message){
        return "Sending... " + message + " to " + phoneNumber;
    }
}
