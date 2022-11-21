package com.java.class26;

public class PC {

    String gpu;
    String cpu;
    String purpose;
    String who;
    int age;

    PC(){
        System.out.println("Welcome to PC specs guide:");
    }

    PC(String why){
        purpose = why;
    }

    PC(String you, int howOld){
        who = you;
        age = howOld;
    }



    public void budget(int budget){
        if(budget >= 4500){
            gpu = "NVIDIA RTX 3090";
            cpu = "Ryzen 9 5900X";
            System.out.println("Base for the build for a budget of " + budget + "$ is: " + gpu + " " + cpu);
        }else if(budget >= 3000 && budget <= 3500){
            gpu = "NVIDIA RTX 3070";
            cpu = "Ryzen 7 5800X";
            System.out.println("Base for the build for a budget of " + budget + "$ is: " + gpu + " " + cpu);
        }else if(budget >= 1000 && budget <= 1500){
            gpu = "NVIDIA 1060 TI";
            cpu = "Ryzen 3 3600";
            System.out.println("Base for the build for a budget of " + budget + "$ is: " + gpu + " " + cpu);
        }else{
            System.out.println("Save up a little bit more");
        }
    }
}
