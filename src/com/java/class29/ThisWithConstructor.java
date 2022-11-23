package com.java.class29;

// You can call another Constructor from another Constructor only
class Bank{

    Bank(){
        this(10);
        System.out.println("From Bank");
    }

    Bank(int balance){
        this(10, 20.0); // calls for the method which conditions it meets
        System.out.println("From Bank " + balance);
    }

    Bank(int a, double b){
        this(b, "Hello");
    }

    Bank(double a, String name){
    }

}


public class ThisWithConstructor {
    public static void main(String[] args) {
        Bank b = new Bank();
    }
}
