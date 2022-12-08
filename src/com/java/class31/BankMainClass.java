package com.java.class31;

public class BankMainClass {
    public static void main(String[] args) {
        ChaseBank cbAccount = new ChaseBank();
        BankOfAmerica boaAccount = new BankOfAmerica();
        WellsFargo wfAccount = new WellsFargo();

        PayPal pp = new PayPal();

        pp.rateOfInterest(cbAccount);
        pp.rateOfInterest(boaAccount);
        pp.rateOfInterest(wfAccount);
    }
}
