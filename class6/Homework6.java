/*
 * Student s17tw, Tyler WOOD
 * Homework 6
 * Usage: java Homework 6 <optional type> <optional amount>
 */

import java.util.Scanner;

class BankAccount{
    double amount;
    double rate;
    String type;
    String gift;

    BankAccount(String type, double amount){
        this.type = type;
        this.amount = amount;
        switch(type){
            case "checking":
                this.rate = 0.0;
                break;
            case "savings":
                this.rate = 0.9;
                break;
            default:
                throw new IllegalArgumentException(
                        "invalid account type: " + type);
        }
    }
    
    BankAccount(){
        this.type = "savings";
        this.amount = 0;
    }

    public static void giftInfo(){
        System.out.println("Deposit $200 and get a toaster");
    }

    public static void giftInfo(double amount){
        if(amount >= 200){
            System.out.println("This deposit will qualify for a toaster");
        }
    }
}

class Homework6{
    public static void main(String[] args){
        BankAccount ba;
        Scanner sc = new Scanner(System.in);
        if(args.length > 0){
            String typearg = args[0];
            double amountarg = Double.parseDouble(args[1]);
            ba = new BankAccount(typearg, amountarg);
        }
        else{
            ba = new BankAccount();
        }

        if(ba.amount < 200){
            ba.giftInfo();
        }
        else{
            ba.giftInfo(ba.amount);
        }
    }
}
