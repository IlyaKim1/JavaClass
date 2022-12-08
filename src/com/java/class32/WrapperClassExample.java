package com.java.class32;

public class WrapperClassExample {
    public static void main(String[] args) {
        int i = 10;
        Integer j = i; // We can convert primitive data type into an Object, so we can use them with methods
                       // this is called Wrapping. And this Class is called Wrapping Class
        Double d = 34.5;// We have these classes for all the primitive data types, not only Int
        System.out.println(j);

        // We can use Wrapper to convert String to int / int to String
        String str1 = new String("23"); // This and the String below are the same thing
        String str2 = "46";
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        System.out.println(String.valueOf(j)); // String value of j
    }
}
