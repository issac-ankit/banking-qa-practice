package day14hashmap;

import java.util.HashMap;
import java.util.Map;

public class AccountRegister {

    public static double getBalanceOrZero(Map<String, Double> balances, String accountNumber) {
        if (balances.containsKey(accountNumber)) {
            return balances.get(accountNumber);
        }
        return 0.0;
    }

    public static int countLowBalance(Map<String, Double> balances) {
        int count = 0;
        for (Double balance : balances.values()) {
            if (balance < 1000) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, Double> balances = new HashMap<>();
        balances.put("ACC101", 5000.0);
        balances.put("ACC102", 12000.0);
        balances.put("ACC103", 800.0);

        System.out.println(getBalanceOrZero(balances, "ACC102")); //expected: 12000.0
        System.out.println(getBalanceOrZero(balances, "ACC999")); //expected: 0.0
        System.out.println(countLowBalance(balances));  //expected: 1
    }
}
