package GroupProjects;

import com.java.class09.LadderIfElseExample;

public class BankAccount {
    final String name;

    private double accountBalance;

    BankAccount(String name){
        this.name = name;
        accountBalance = 0.0;
    }
    public void getCredentials(){
        System.out.println("Here is your Checking Account name");
        System.out.println("Here is your Checking Account number");
        System.out.println("Your Checking Account has a balance of: $" + accountBalance);
    }
    public double getBalance(){
        return accountBalance;
    }
    public void deposit(double amount){
        accountBalance = accountBalance + amount;
        System.out.println(name + " has $" + accountBalance);
    }
    public void withdraw(double amount){
        if (amount <= accountBalance){
            accountBalance = accountBalance - amount;
            System.out.println(name + " has $" + accountBalance);
        }else {
            System.out.println("Withdrawal by " + name + " is declined.");
        }

    }
    public void transfer(double amount, BankAccount acc){
        if (this.accountBalance < amount){
            System.out.println("Transfer failed");
        }else {
            this.accountBalance = accountBalance - amount;
            acc.accountBalance = accountBalance + amount;
            System.out.println("Account of " + this.name + " has now $" + this.accountBalance);
            System.out.println("Account of " + acc.name + " has now $" + acc.accountBalance);
        }
    }


    public void payCreditCardBill(double payment){
        double creditBill = 1000;
        double remainder;
        lineOfEquals();
        System.out.println("Your credit bill amount is: " + creditBill);
        System.out.println("Your current checking balance is: " + accountBalance);
        System.out.println("Your payment is: " + payment);
        lineOfEquals();
        if(payment <= accountBalance && payment < creditBill){
            accountBalance -= payment;
            creditBill -= payment;
            lineOfEquals();
            System.out.println("Your payment of " + payment + " was successful");
            System.out.println("Your Credit Bill is now: " + creditBill);
            System.out.println("Your account balance is now: " + accountBalance);
            lineOfEquals();
        }else if(payment <= accountBalance && payment > creditBill) {
            accountBalance -= payment;
            remainder = payment - creditBill;
            lineOfEquals();
            System.out.println("Your payment of " + payment + " was successful");
            System.out.println("Your credit bill was OVERPAID, the remainder of your payment is: " + remainder + "\n" + "it was transferred back to your account");
            System.out.println("Your checking balance after payment: " + (accountBalance + remainder));
            lineOfEquals();
        }else if(payment == creditBill){
            accountBalance -= payment;
            lineOfEquals();
            System.out.println("CONGRATULATIONS!!!");
            System.out.println("Your payment of " + payment + " was successful");
            System.out.println("Your credit bill was fully paid");
            System.out.println("Your checking balance after payment: " + accountBalance);
            lineOfEquals();
        }else{
            lineOfEquals();
            System.out.println("Your transaction was declined. Error: Insufficient funds");
            System.out.println("Your checking balance: " + accountBalance);
            System.out.println("The amount you were trying to pay: " + payment);
            lineOfEquals();
        }
    }
    public void lineOfEquals(){
        System.out.println("===============================================");
    }
}
