package com.java.class29;

class Bank1{

//    Bank1(){
//        this(10);
//        System.out.println("From Bank");
//    }

    Bank1(int balance){
        System.out.println("From Bank " + balance);
    }

}

class CityBank extends Bank1 {
    CityBank(){
        super(10);
    }
}


public class SuperWithConstructor {
    public static void main(String[] args) {
        CityBank b = new CityBank();

    }
}




