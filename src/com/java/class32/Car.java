package com.java.class32;

public class Car {
    private int speed;
    private String color;
    private int price;

    public Car(){
        System.out.println("From Car Constructor");
    }

    public int getSpeed(){ // This method is called Getter
        return speed;
    }
    public void setSpeed(int speed){ // This method is called Setter
        // All your logic to identify the transaction log
        this.speed = speed;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
