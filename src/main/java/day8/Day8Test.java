package day8;

public class Day8Test {

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit(10000);
        s.addInterest();
        System.out.println(s.getBalance());   // Expected: 10500.0
    }
}
