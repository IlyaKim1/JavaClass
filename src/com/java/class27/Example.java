package com.java.class27;

class Car{
    static int numOfCars;

    Car(){
        numOfCars++;
    }
}

public class Example {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();
        Car toyota = new Car();

        System.out.println(toyota.numOfCars);

    }
}
