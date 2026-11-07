package day13;

import java.util.ArrayList;
import java.util.List;

public class TransactionSummary {

    public static double totalCredits(List<Double> transactions) {
        double total = 0;
        for (Double amount : transactions) {
            if (amount > 0) {
                total = total + amount;
            }
        }
        return total;
    }

    public static int highValueCount(List<Double> transactions) {
        int total = 0;

        for (double transaction : transactions) {
            if (transaction > 10000) {
                total = total + 1;
            }

        }
        return total;
    }

    public static double totalDebits(List<Double> transactions) {
        double totalDebits = 0;

        for (double amount : transactions) {
            if (amount < 0) {
                totalDebits = totalDebits + amount;
            }
        }
        return totalDebits;
    }

    public static void main(String[] args) {
        List<Double> transactions = new ArrayList<>();
// 5000.0, -2000.0, 15000.0, -500.0, 25000.0
        transactions.add(5000.0);
        transactions.add(-2000.0);
        transactions.add(15000.0);
        transactions.add(-500.0);
        transactions.add(25000.0);
        transactions.add(10000.0);

        System.out.println(totalCredits(transactions));    // Expected: 45000.0
        System.out.println(highValueCount(transactions)); // Expected: 2
        System.out.println(totalDebits(transactions));  // Expected: -2500
    }
}
