public class SavingsAccount {
    String accountNumber;
    double balance;
    static double interestRate = 3.5;

    SavingsAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double yearlyInterest() {
        return balance * interestRate / 100;
    }

    public static double changeRate(double newRate) {
        return interestRate = newRate;
    }

    public static void main(String[] args) {
        SavingsAccount acct1 = new SavingsAccount("ABC001", 100000);
        SavingsAccount acct2 = new SavingsAccount("ABC002", 50000);

        System.out.println("the interset is : " + acct1.yearlyInterest());
        System.out.println("the interset is : " + acct2.yearlyInterest());

        SavingsAccount.changeRate(4);
        System.out.println("the Updated interset is : " + acct1.yearlyInterest());
        System.out.println("the Updated interset is : " + acct2.yearlyInterest());


    }
}
