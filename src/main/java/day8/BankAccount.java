package day8;

import java.sql.SQLOutput;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        balance=balance+amount;
    }
    public double getBalance(){
        return  balance;
    }


}
