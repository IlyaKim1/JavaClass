package com.java.class07;

import java.util.Scanner;

public class aHW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please put in a month number form 1 to 12: ");
        int m = sc.nextInt();

        if(m == 1){
            System.out.println("There's 31 days in January");
        }else if(m == 2){
            System.out.println("There's 28 days in February");
        }else if(m == 3){
            System.out.println("There's 31 days in March");
        }else if(m == 4){
            System.out.println("There's 30 days in April");
        }else if(m == 5){
            System.out.println("There's 31 days in May");
        }else if(m == 6){
            System.out.println("There's 30 days in June");
        }else if(m == 7){
            System.out.println("There's 31 days in July");
        }else if(m == 8){
            System.out.println("There's 31 days in August");
        }else if(m == 9){
            System.out.println("There's 30 days in September");
        }else if(m == 10){
            System.out.println("There's 31 days in October");
        }else if(m == 11){
            System.out.println("There's 30 days in November");
        }else if(m == 12){
            System.out.println("There's 31 days in December");
        }else{
            System.out.println("Only enter a month number from 1 to 12");
        }
    }
}
