package com.java.class28;

public class MainClassCalculator {
    public static void main(String[] args) {
        BasicCalculator b = new BasicCalculator();
        b.sum(10, 20);
        b.sub(10, 20);

        AdvancedCalculator ac = new AdvancedCalculator();
        ac.mul(10, 20);
        ac.div(10, 20);
        ac.sub(10, 20);
        ac.sum(10, 20);
    }
}
