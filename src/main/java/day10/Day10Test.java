package day10;

public class Day10Test {


    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();
        FixedDepositAccount fixedDeposit = new FixedDepositAccount();

        savings.deposit(10000);
        System.out.println("The Interest is : " + savings.calculateInterest()); //Expected: 400
        System.out.println("the balance is : " + savings.getBalance()); //Expected: 10000.0

        current.deposit(10000);
        System.out.println("The Interest is : " + current.calculateInterest()); //Expected: 0
        System.out.println("the balance is : " + current.getBalance()); //Expected: 10000

        fixedDeposit.deposit(50000);
        System.out.println("The Interest is : " + fixedDeposit.calculateInterest()); //Expected: 3500

        System.out.println("Cheque 12345 accepted? " + savings.deposit(2000, "12345"));  // Expected: false
        System.out.println("the balance is : " + savings.getBalance()); // Expected:false, 10000.0

        System.out.println("Cheque 123456 accepted? " + savings.deposit(2000, "123456"));  // Expected: true
        System.out.println("the balance is : " + savings.getBalance());// Expected:true, 12000.0

        System.out.println("Cheque 1234567 accepted? " + savings.deposit(2000, "1234567"));  // Expected: false
        System.out.println("the balance is : " + savings.getBalance());// Expected:false, 12000.0

    }
}
