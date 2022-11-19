package com.java.class27;

class Bank{
    int balance = 50;

    public void method1(){
        System.out.println(balance);
        balance = 40;
    }
}

public class TypesOfVariables {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.balance);
        b.method1();
        b.method1();
        System.out.println(b.balance);

    }
}
