package day9;

public class CurrentAccount extends BankAccount {

    @Override
    public boolean withdraw(double amount) {
        if (balance -amount>= -5000) {
            balance = balance - amount;
            return true;
        }
        return false;
    }




}