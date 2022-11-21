package com.java.class26;

import java.io.FilterOutputStream;
import java.util.Scanner;
public class PCMain {
    public static void main(String[] args) {
        PC p1 = new PC();
        System.out.println();
        PC p2 = new PC("gaming");
        PC p3 = new PC("student",22);

        System.out.println("I want a PC for " + p2.purpose);
        System.out.println("I am a " + p3.who + ", " + " and I am " + p3.age + " years old" );
        System.out.println();
        p1.budget(4567);


    }
}
