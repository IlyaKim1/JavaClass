package com.SelfLearning;

import java.util.Scanner;

public class DotaMMRcounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your current MMR?");
        int current = sc.nextInt();
        String yn;


        do {
            lineOfEquals();
            System.out.println("Did you get the dub? W/L");
            lineOfEquals();
            String WorL = sc.next();

            if (WorL.equalsIgnoreCase("w")) {
                current += 30;
                lineOfEquals();
                System.out.println("Keep it up, now your MMR is: " + current);
                lineOfEquals();
            } else if (WorL.equalsIgnoreCase("l")) {
                current -= 30;
                lineOfEquals();
                System.out.println("Try better, now ur MMR is: " + current);
                lineOfEquals();
            } else {
                lineOfEquals();
                System.out.println("Check your input, use only letters W or L");
                lineOfEquals();
            }
            skipLane();
            lineOfEquals();
            System.out.println("Wanna play another one? Y/N");
            lineOfEquals();

            yn = sc.next();

        } while (yn.equalsIgnoreCase("Y"));

    }

    static void lineOfEquals() {
        System.out.println("=================================");

    }
    static void skipLane(){
        System.out.println("\n");
    }
}

