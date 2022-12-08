package com.java.class36;

public class DisabledPatient extends Patient{
    public void takeTylenol(){
        System.out.println("Your recommended dosage is: 200mg");
    }

    public double makePayments(double total, double amountReceived){
        double discount;
        discount = total * 0.20;
        total = total - discount - amountReceived;
        return total;
    }
}
