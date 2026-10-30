package day10;

public class FixedDepositAccount extends Account {

    @Override
    public double calculateInterest() {
        return balance * 7 / 100;
    }
}
