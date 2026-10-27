public class BankAccount {
    static int totalAccounts=0;
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
          totalAccounts=totalAccounts+1;
    }

    public static int getTotalAccounts(){
    return totalAccounts;
    }

    public static void main(String[] args) {
        System.out.println("Total accounts is : " + BankAccount.getTotalAccounts());
        BankAccount accountA= new BankAccount("1001", 5000);
        System.out.println("Total accounts is : " + BankAccount.getTotalAccounts());
        BankAccount accountB= new BankAccount("1002", 2000);

        BankAccount accountC= new BankAccount("1003", 8000);
        System.out.println("Total accounts is : " + BankAccount.getTotalAccounts());


    }
}
