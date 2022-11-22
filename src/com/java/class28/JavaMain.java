package com.java.class28;

public class JavaMain {
    public static void main(String[] args) {
        Java j = new Java();

        j.love();
        j.time(2);

        AdvancedJava j1 = new AdvancedJava();

        System.out.println("=======================================");
        j.love();
        j.time(2);
        j1.core("done");
        j1.future(4);
    }
}
