package com.java.class20;

public class FrequencyOfGivenChar {
    public static void main(String[] args) {
        String str = "Hello, How are you?";
        char target = 'e';
        System.out.println(countE(str));

    }
    static int countE(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e' || str.charAt(i) == 'E'){
                count++;
            }
        }
        return count;
    }
}
