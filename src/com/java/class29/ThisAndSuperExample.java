package com.java.class29;

class Vehicle{
    int speed = 50;

    void drift(){
        System.out.println("Drifting Car");
    }
}

// this. -> refers to current class object
class Car extends Vehicle{
    int speed = 100;

    void drift() {
        int speed = 200;
        System.out.println(speed); // 200
        System.out.println(this.speed); // 100
        System.out.println(super.speed); // 50
        // drift(); / this.drift(); -> The process of calling the function like this is called Recursion
        super.drift();
    }

    void speedUp(int a){
        this.speed += a;
        super.speed += a;

        if(this.speed == 200){
            System.out.println(this.speed);
            if(super.speed == 150){
                System.out.println("Hooray");
            }
        }
    }
}

public class ThisAndSuperExample{
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.speed); // 100
        c.drift();
        System.out.println();
        c.speedUp(100);
    }
}
