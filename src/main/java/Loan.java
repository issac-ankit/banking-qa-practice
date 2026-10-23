public class Loan {
    int loanId;
    String customerName;
    double principal;

    public void repay(double amount) {
        principal = principal - amount;     // updates the object's field
    }

    public static void main(String[] args) {
        Loan loan1 = new Loan();
        loan1.loanId = 1001;
        loan1.customerName = "Issac Ankit";
        loan1.principal = 150000.00;

        Loan loan2 = new Loan();
        loan2.loanId = 1002;
        loan2.customerName = "Dhanalakshmi";
        loan2.principal = 250000.00;

        loan1.repay(15600);

        loan2.repay(100000);

        System.out.println(loan1.customerName + " principal: " + loan1.principal);
        System.out.println(loan2.customerName + " principal: " + loan2.principal);
    }
}