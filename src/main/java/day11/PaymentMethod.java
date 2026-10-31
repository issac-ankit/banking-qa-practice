package day11;

interface PaymentMethod {
//    Requirement:
//    Interface PaymentMethod with one method: pay an amount, and tell the caller whether the payment succeeded.
//    UpiPayment implements it: allowed only if amount is ≤ 100000 (1 lakh) and > 0.
//    NeftPayment implements it: allowed if amount is ≥ 1 (no upper limit).
//    Day11Test: use the interface type for the variable, like WebDriver:

    public boolean pay(double amount);
//    ❌ But {} is a body. In an interface, methods are just promises: no body,
//    end with a semicolon, like the abstract method yesterday:
//    (Interface methods are automatically public and abstract,
//    so you can skip both words. Writing public is also OK.)



    class NeftPayment implements PaymentMethod {

        @Override
        public boolean pay(double amount) {
            if (amount >= 1) {
                return true;
            }
            return false;
        }

    }


}
