package com.java.class26;

public class Car {
    int speed;
    String color;

    void drive(){
        System.out.println("Driving " + color + " car at speed " + speed);
    }
    int increaseSpeed(int speed){
        speed += 500;
        return speed;
    }
    void decreaseSpeed(Car myCar){
        myCar.speed -= 200;
    }

    void makeSpeedZero(){
        speed = 0;
    }

}
