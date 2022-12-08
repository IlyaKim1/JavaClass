package com.java.class31;

public class PayPal {
    void checkBalance(Bank b){
        b.checkBalance();
    }

    void withdraw(Bank b, int amount){
        b.withdraw(amount);
    }

    void rateOfInterest(Bank b){
        b.rateOfInterest();
    }
}
