package day10;

public class SavingsAccount extends Account {


    @Override
    public double calculateInterest() {
        return balance * 4 / 100;
    }
}
