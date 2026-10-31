package day11;

class NeftPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        if (amount >= 1) {
            return true;
        }
        return false;
    }

}