package day9;

public class Day9Test {

    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount();
        BankAccount acct2 = new CurrentAccount();

        acct1.deposit(1000);

        System.out.println("The current balance is : " + acct1.getBalance());

        System.out.println("Withdraw 3000 success? " + acct1.withdraw(3000));   // Expected: false
        System.out.println("Balance: " + acct1.getBalance());                   // Expected: 1000.0

        acct2.deposit(1000);
        System.out.println("Withdraw 3000 success ? " + acct2.withdraw(3000)); // Expected: true
        System.out.println("Balance: " + acct2.getBalance());                   // Expected: -2000.0

        System.out.println("Withdraw 4000 success ? " + acct2.withdraw(4000)); // Expected: false
        System.out.println("Balance: " + acct2.getBalance());// Expected: -2000.0

        System.out.println("Withdraw 3000 success ? " + acct2.withdraw(3000)); // Expected: true
        System.out.println("Balance: " + acct2.getBalance());  // Expected: -5000.0

    }
}
