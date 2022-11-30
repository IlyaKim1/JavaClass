package com.java.class30;


public class Bank {

    void displayRateOfInterest(){
        System.out.println("4%");
    }
}

class ChaseBank extends Bank{

}

class BankOfAmerica extends Bank{

}


class CityBank extends Bank{

}

public class BankAcc{
    public static void main(String[] args) {
        ChaseBank c = new ChaseBank();
        BankOfAmerica ba = new BankOfAmerica();
        ba.displayRateOfInterest();
    }
}