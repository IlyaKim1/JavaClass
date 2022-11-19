package com.java.class19;

public class HW1 {
    public static void main(String[] args) {


        for(int i = 1; i <= 100; i++){
            if(isPal(i)){
                System.out.println(i);
            }
        }


    }
   static boolean isPrime(int num){
        int divisor = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                divisor++;
            }
        }
        if(divisor == 2){
            return true;
        }else{
            return false;
        }
   }
   static boolean isPal(int num){
       int orgNum = num;
       int rev = 0;
       int lastD;


       while (num != 0) {
           lastD = num % 10;
           rev = rev * 10 + lastD;
           num /= 10;
       }

       if (orgNum == rev) {
           return true;
       } else {
           return false;
       }
   }
}
