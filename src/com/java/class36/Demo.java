package com.java.class36;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Patient p1 = new GeneralPatient();      // required to pay the full price
//        Patient p2 = new ChildPatient();        // given a discount of 10%
//        Patient p3 = new SeniorPatient();       // given a discount of 40%
//        Patient p4 = new DisabledPatient();     // given a discount of 20%
//
//
//        p1.takeTylenol();
//        p2.takeTylenol();
//        p3.takeTylenol();
//        p4.takeTylenol();
//        System.out.println();
//        System.out.println("Your total after the payment(s): " + p1.makePayments(1000, 200));
//        System.out.println("Your total after the payment(s): " + p2.makePayments(1000, 200));
//        System.out.println("Your total after the payment(s): " + p3.makePayments(1000, 200));
//        System.out.println("Your total after the payment(s): " + p4.makePayments(1000, 200));

        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("What is your balance?");
        double balance = sc.nextDouble();
        System.out.println("How much do you want to pay?");
        double payment = sc.nextDouble();
        // what is dynamic polymorphism?
        // you can decide what object to initialize during the runtime
        // the Parent class variable should be able to hold any of the child class obhects
        // this helps to write the logic once, without repetition, which should be our goal

        Patient patient; // Dynamic Polymorphism
        if(age < 10){
            patient = new ChildPatient();
        }else if(age > 10 && age < 60){
            patient = new GeneralPatient();
        }else{
            patient = new SeniorPatient();
        }

        // in order to be able to apply Dynamic Polymorphism and call one method from different child Objects
        // the method myst be defined in the parent class.
        // but which version of the method is going to be executed depends on what child object is instantiated.

        double remainingBalance = patient.makePayments(balance, payment);
        patient.takeTylenol();
        System.out.println("Your remaining balance is: " + remainingBalance);



    }
}
