package com.java.class36;

// abstract classes can not be instantiated, initialized directly
// this is good for cases like BaseIphone vs concrete Iphones like Iphone7
// abstract classes can not be final.
// what happens if the class in final? => you cannot extend it. you can not change any values in it.
// because the whole point of abstract classes is to be extended.
// abstract classes can not be market private.

public abstract class Patient {
    // abstract methods do not have any implementation
    // which means we know and require each child class to have a takeTylanol method
    // and should write the specific logic to each child class

    public abstract void takeTylenol();



    // we want to create a method to inquire the payments
    // requirements:
    // 1. Child Patients should be given 10% discount
    // 2. General Patients should be given the full price
    // 3. Seniors should be given 40% discount
    // 4. Disabled Patients should be given 20% discount
    // the method should take an amountReceived parameter.
    // and the method should return remainingBalance.
    public abstract double makePayments(double total, double amountReceived);

    // ask a user for their age
    // if the age is less than 10 y.o. create childPatient
    // if the age is more or equal to 10 and less than 60 create generalPatient
    // if the age is more or equal to 60 create seniorPatient
    // ask the user to enter their balance
    // ask how much they want to pay
    // apply their discount if applicable
    // return their remaining balance
}

// Patient varP = new Patient();
// you declare variable, not an object.
// initialize -> new object, or value(literal values)
// 12
//"gdg"