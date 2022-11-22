package com.java.class28;

import java.lang.invoke.SwitchPoint;

class Factory{
    Factory(){
        System.out.println("1. From Factory");
    }
}

public class Vehicle extends SportsCar {
    Vehicle(){
        System.out.println("2. From Vehicle");
    }
}

class Car extends SportsCar{
    Car(){
        System.out.println("3. From Car");
    }

}

class SportsCar extends Factory{
    SportsCar(){
        System.out.println("4. From Sports Car");
    }

}
