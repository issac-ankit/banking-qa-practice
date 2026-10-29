package day9;

public class BankAccount {
    protected double balance;

//    private	Only the class itself
//    protected	The class + its children (+ same package)
//    public	Everyone
//
//    Simple picture: private = only me; protected = my family; public = everyone.
//
//    So in BankAccount, change private double balance; → protected double balance;. Now CurrentAccount can use balance directly.
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if(balance>=amount){
            balance = balance - amount;
            return true;
        }
        return false;
    }



   }

