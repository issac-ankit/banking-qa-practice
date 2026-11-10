package day15exceptions;

public class SafeAccount {
//    Exceptions: what happens when something goes wrong//
//    Simple idea: an exception is Java saying “I can’t continue:
//    something unexpected happened.”
//    Without handling, the program crashes and stops: nothing after that line runs.
//Checked exceptions are checked at compile time and must be handled or declared,
// like IOException when reading a test data file. Unchecked exceptions are runtime
// exceptions, usually programming errors, like NullPointerException.”
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        } else {
            balance = balance + amount;

        }
    }

    public static void main(String[] args) {
        SafeAccount acct = new SafeAccount();
        acct.deposit(5000);
        try {
            acct.deposit(-100); //expected : Deposit amount must be positive

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("the balance is : " + acct.balance); //expected: the balance is : 5000.0
        }
    }
}
