package com.java.class16;

public class NestedForLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 2; i++){ //This for loop will execute 2 times, prompting the next for loop to execute 2 times

            for(int j = 1; j <= 3; j++){ //This for loop will execute itself 3 times each time printing "Hello" 3 times

                System.out.println("Hello"); // So we will get "Hello" 6 times in total
            }
        }


    }
}
