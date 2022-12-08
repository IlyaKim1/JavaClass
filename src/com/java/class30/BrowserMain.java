package com.java.class30;

import java.util.Scanner;

public class BrowserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser = sc.next();

//        if (browser.equalsIgnoreCase("chrome")) {
//            Chrome c = new Chrome();
//            c.openIncognitoWindow();
//        } else {
//            FireFox f = new FireFox();
//            f.openIncognitoWindow();
//        }


        Browser b;
        if (browser.equalsIgnoreCase("chrome")) {
            b = new Chrome();
        } else {
            b = new FireFox();
        }
        b.openIncognitoWindow();
    }
}
