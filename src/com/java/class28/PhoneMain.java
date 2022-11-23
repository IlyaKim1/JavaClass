package com.java.class28;

public class PhoneMain {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        Phone p2 = new Phone("Basic");
        p1.totalCalls(250);
        System.out.println(p1.calls);
        p2.basicPlan(250);

        AdvancedPhone a1 = new AdvancedPhone();
        Phone a2 = new Phone("Advanced");
        a1.totalCalls(250);
        System.out.println(a1.calls);
        a1.advancedPlan(250);

        Unlimited u1 = new Unlimited();
        Phone u2 = new Phone("Unlimited");
        u1.ultimatePlan(500);
    }
}
