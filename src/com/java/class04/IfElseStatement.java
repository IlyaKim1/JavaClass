package com.java.class04;

public class IfElseStatement {
    public static void main(String[] args) {
        int a = 11;
        boolean b = a >= 11; // You can put any equation in the boolean, but it will only give you "true" or "false"
        System.out.println("1"); //No condition required for this line, so Java will print it out no problem.

        if(b){ //If this condition is true Java will print this line in the result.
            System.out.println("2");
        }else{ //If the condition is false Java will print out the "else" line instead.
            System.out.println("3");
        }
        System.out.println("4"); //No condition required for this line, so Java will print it out no problem.

    }
}
