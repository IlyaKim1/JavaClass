package com.java.class21;

import java.util.Scanner;

public class aHW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to find its vowels and constants");
        String str = sc.nextLine();
        countVAndC(str);



    }
    static void countVAndC(String str){
        int countV = 0;
        int countC = 0;

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == 'a' || a == 'A' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'e' || a == 'E' || a == 'u' || a == 'U') {
                countV++;
            } else if(a >= 'a' && a <= 'z' || a >= 'A' && a<= 'Z')
                countC++;
        }

        System.out.println("Total Vowels: " + countV);
        System.out.println("Total Constants: " + countC);
    }
}
