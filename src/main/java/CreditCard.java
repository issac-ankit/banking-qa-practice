public class CreditCard {
    String cardNumber;
    String holderName;
    double usedAmount;
    double creditLimit;

    public CreditCard(String cardNumber, String holderName, double creditLimit) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.creditLimit = creditLimit;
    }

    public boolean spend(double amount) {
        if (amount <= 0 || amount > getAvailableLimit()) {
            return false;                       // declined: nothing changes
        }
        usedAmount = usedAmount + amount;       // approved: update
        return true;
    }

    public void payBill(double amount) {
        usedAmount = usedAmount - amount;

    }

    public double getUsedAmount() {
        return usedAmount;
    }

    public double getAvailableLimit() {
        return creditLimit - usedAmount;

    }

    public boolean isOverLimit() {
        return usedAmount > creditLimit;

    }


    public static void main(String[] args) {
        checkSpend(-1, false);
        checkSpend(0, false);
        checkSpend(1, true);
        checkSpend(19_999, true);
        checkSpend(20_000, true);
        checkSpend(20_001, false);


//        hdfcCard.spend(80000);
//        System.out.println("Afer Spending 80000 : " + hdfcCard.getUsedAmount() +
//                " Available limit is :" + hdfcCard.getAvailableLimit() +
//                " is OverLimit : " + hdfcCard.isOverLimit());
//
//        hdfcCard.spend(30000);
//        System.out.println("Afer Spending 30000 : " + hdfcCard.getUsedAmount() +
//                " Available limit is :" + hdfcCard.getAvailableLimit() +
//                " is OverLimit : " + hdfcCard.isOverLimit());
//
//        hdfcCard.payBill(20000);
//        System.out.println("Afer paying 20000 : " + hdfcCard.getUsedAmount() +
//                " Available limit is :" + hdfcCard.getAvailableLimit() +
//                " is OverLimit : " + hdfcCard.isOverLimit());


    }


    public static void checkSpend(double amount, boolean expected) {
        CreditCard axisBank = new CreditCard("100002", "Issac", 100000);
        axisBank.spend(80000);
        boolean actual = axisBank.spend(amount);
        if (actual == expected) {
            System.out.println("Amount " + amount + " -> PASS");
        } else {
            System.out.println("Amount " + amount + " -> FAIL");
        }
    }
}


