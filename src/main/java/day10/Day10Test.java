package day10;

public class Day10Test {

    public static void main(String[] args) {
        SavingsAccount acct1 = new SavingsAccount();
        CurrentAccount acct2 = new CurrentAccount();
        FixedDepositAccount acct3 = new FixedDepositAccount();
        acct1.deposit(10000);
        System.out.println("The Interset is : " + acct1.calculateInterest()); //Expected: 400

        System.out.println("the balance is : " + acct1.getBalance());

        acct2.deposit(10000);
        System.out.println("The Interset is : " + acct2.calculateInterest()); //Expected: 0

        System.out.println("the balance is : " + acct2.getBalance());

        acct3.deposit(50000);
        System.out.println("The Interset is : " + acct3.calculateInterest()); //Expected: 3500


    }
}
