package com.java.class36;

public class GeneralPatient extends Patient{
    @Override
    public void takeTylenol() {
        System.out.println("Your recommended dosage is 250mg");
    }
    public double makePayments(double total, double amountReceived){
        return total - amountReceived;
    }
}
