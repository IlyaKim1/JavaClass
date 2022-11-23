package com.java.class28;

class Phone{

    int price;
    int calls;
    int extraCalls;
    double overLimit$;
    double total$;

    Phone(){
        System.out.println("\n===~~~~~~~~~~~~~~===");
        System.out.println("Welcome to EasyCalls");
        System.out.println("===~~~~~~~~~~~~~~===");
    }
    Phone(String plan){
        System.out.println("Your plan: " + plan);
    }


    public void totalCalls(int a){
        calls = a;
        System.out.println("\nYour total calls for this month is: " + calls);
    }

    public void basicPlan(int a) {
        price = 40;
        if (a <= 100) {
            total$ = a * 0.49;
            System.out.println("\nBasic plan total: " + total$);
        }else{
            extraCalls = a - 100;
            overLimit$ = (a - 100) * 0.79;
            total$ = 100 * 0.49 + price + overLimit$;

            System.out.println("\nNumber of your over limit calls: " + extraCalls);
            System.out.println("Your over limit calls bill is: " + overLimit$ + ", and regular plan bill is: " + 100 * 0.49);
            System.out.println("Your total for this month is: " + total$);

        }
    }
}

class AdvancedPhone extends Phone{

    public void advancedPlan(int a){
        price = 80;
        if (a <= 100) {
            System.out.println("\nAdvanced Plan covered your calls");
        }else{
            overLimit$ = (a - 100) * 0.29;
            extraCalls = a - 100;
            total$ = overLimit$ + price;
            System.out.println("\nAdvanced plan covered your first 100 calls this month");
            System.out.println("Number of your over limit calls: " + extraCalls);
            System.out.println("Your over limit calls bill is: " + overLimit$);
            System.out.println("Your total for this month is: " + total$);
        }
    }
}

class Unlimited extends AdvancedPhone{

    public void ultimatePlan(int a){
        price = 200;
        System.out.println("Unlimited plan cover all your calls cost");
        System.out.println("Your total calls for this month is: " + a);
        System.out.println("Your total for this month: " + price);
    }
}