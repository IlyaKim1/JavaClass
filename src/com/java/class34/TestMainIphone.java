package com.java.class34;

public class TestMainIphone {
    public static void main(String[] args) {
        Iphone7 iPhone7 = new Iphone7("iPhone7","JetBlack", 256,"iOS 12");

        System.out.println(iPhone7.getUserTouchID("sdfq13"));
        System.out.println(iPhone7.whichIphone(iPhone7));

    }
}