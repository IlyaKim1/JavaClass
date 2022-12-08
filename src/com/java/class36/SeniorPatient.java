package com.java.class36;

public class SeniorPatient extends Patient{
    public void takeTylenol(){
        System.out.println("Your recommended dosage is: 500mg");
    }

    public double makePayments(double total, double amountReceived){
        double discount;
        discount = total * 0.40;
        total = total - discount - amountReceived;
        return total;
    }
}
