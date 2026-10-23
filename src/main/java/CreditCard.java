public class CreditCard {
    String cardNumber;
    String holderName;
    double usedAmount;
    double creditLimit;

    public CreditCard(String cardNumber,String holderName, double creditLimit ){
        this.cardNumber=cardNumber;
        this.holderName=holderName;
        this.creditLimit=creditLimit;
    }
    public void spend(double amount) {
        usedAmount = usedAmount + amount;
    }

    public void payBill(double amount) {
        usedAmount = usedAmount - amount;

    }

    public double getUsedAmount() {
        return usedAmount;
    }

    public double getAvailableLimit() {
        return creditLimit-usedAmount;

    }

    public boolean isOverLimit() {
        return usedAmount>creditLimit;

}
    public static void main(String[] args) {
        CreditCard hdfcCard = new CreditCard("10001","Issac",100000);
        CreditCard iciciCard = new CreditCard("10002","Issac", 80000);
        CreditCard axisCard = new CreditCard("200001","Issac" , 100000);



        hdfcCard.spend(80000);
        System.out.println("Afer Spending 80000 : " + hdfcCard.getUsedAmount() +
                        " Available limit is :" + hdfcCard.getAvailableLimit() +
                " is OverLimit : " + hdfcCard.isOverLimit());

        hdfcCard.spend(30000);
        System.out.println("Afer Spending 30000 : " + hdfcCard.getUsedAmount() +
                " Available limit is :" + hdfcCard.getAvailableLimit() +
                " is OverLimit : " + hdfcCard.isOverLimit());

        hdfcCard.payBill(20000);
        System.out.println("Afer paying 20000 : " + hdfcCard.getUsedAmount() +
                " Available limit is :" + hdfcCard.getAvailableLimit() +
                " is OverLimit : " + hdfcCard.isOverLimit());



    }
}
