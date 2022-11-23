package com.java.class29;

class  Work{
    double totalPay;

    Work(String welcome){
        System.out.println("=======================");
        System.out.println("Welcome to your account");
        System.out.println("=======================");
    }

    Work(int days, double hourly){
        this("welcome");
        totalPay = days * hourly;
        System.out.println("\nDays worked: " + days);
        System.out.println("Hourly rate: " + hourly + "$");
    }

    Work(double g){
        this(14, 25.5);
        g = totalPay;
        double tax = totalPay * 0.30;

    }

    Work(){
        this(0);
        double gross = totalPay;
        double tax = totalPay * 0.30;

        System.out.println("Your total Pay is: " + totalPay + "$");
        System.out.println("Total taxes: " + tax + "$");
        System.out.println("Your Pay after taxes: " + (gross - tax) + "$");
    }

}

class Benefits extends Work{

    double benefits;
    int insurance;

    Benefits(String s){
        super(14, 25.5);
        benefits = totalPay * 0.10;
    }

    Benefits(int d){
        this("s");
        insurance = d / 7 * 20;
    }

    Benefits(){
        this(14);
        System.out.println("\nYour total benefits for the time you've worked: " + benefits + "$");
        System.out.println("your insurance cost: " + insurance + "$");
    }

}

public class HomeWork {
    public static void main(String[] args) {

        Work w1 = new Work();
        System.out.println();
        Benefits b1 = new Benefits();
    }

}

































