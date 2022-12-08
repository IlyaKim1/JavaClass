package com.java.class36;

public class ChildPatient extends Patient{
    @Override
    public void takeTylenol() {
        System.out.println("Your recommended dosage is: 5ml");
    }

    public double makePayments(double total, double amountReceived){
        double discount;
        discount = total * 0.10;
        total = total - discount - amountReceived;
        return total;
    }
}
