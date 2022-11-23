package com.java.class29;

class Animal{
    Animal(int a){
    }

}

class Dog extends Animal{
    Dog(int a){
        super(a);
    }

}

public class ThisSuperWithConstructorExample {
    public static void main(String[] args) {
        Dog d = new Dog(30);
    }
}
