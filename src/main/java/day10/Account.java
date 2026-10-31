package day10;

public abstract class Account {

    protected double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount, String chequeNo) {
        if (chequeNo.length() == 6) {
            balance = balance + amount;
            return true;
        }
        return false;
    }

    public abstract double calculateInterest();
}
