package day10;

public abstract class Account {

    protected double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}
