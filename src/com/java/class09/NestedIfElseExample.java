package com.java.class09;

import java.util.Scanner;

public class NestedIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        double age = sc.nextDouble();
        System.out.println("Please enter your salary: ");
        double salary = sc. nextDouble();

//        if(age < 18){
//            System.out.println("You're too young to get a credit card");
//        }else if(age >= 18 && salary < 5000) {
//            System.out.println("You need to get a better job and come back");
//        }else if(age >= 18 && salary >= 20000){
//            System.out.println("You get a free credit card");
//        }else if( age >= 18 && salary >= 5000) {
//            System.out.println("You're eligible to get a credit card");

        if(age >= 18) {
            if(salary < 5000){
                System.out.println("Work hard");
            }else if(salary > 20000){
                System.out.println("You get a free credit card");
            }else if(salary >= 5000) {
                System.out.println("You're eligible");
            }
        }else{
            System.out.println("You're not eligible");

        }

    }
}
