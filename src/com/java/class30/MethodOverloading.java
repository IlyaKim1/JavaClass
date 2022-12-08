package com.java.class30;

class Demo{
    void sum(int a, int b){

    }

    void sum(double c, int d){

    }

    void sum(int c, int d, int f){

    }

    void sum(int r, double e){

    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sum(10, 20);
        d.sum(10.4, 20);
        d.sum(10, 20,40);
        d.sum(10, 20.5);
    }
}
