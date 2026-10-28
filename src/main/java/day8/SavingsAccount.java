package day8;

public class SavingsAccount extends BankAccount{


        public void addInterest() {
            double interest = getBalance() * 5 / 100;
            deposit(interest);
        }
    }



