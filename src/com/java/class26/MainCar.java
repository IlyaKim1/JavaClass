package com.java.class26;

public class MainCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.speed = 200;
        c1.color = "White";
        c2.speed = 300;
        c2.color = "Red";

        c1.speed = c1.increaseSpeed(c1.speed);
        c1.decreaseSpeed(c1);
        c1.makeSpeedZero();

        System.out.println(c1.speed);
    }
}
