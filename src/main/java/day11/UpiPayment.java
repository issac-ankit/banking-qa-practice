package day11;

    class UpiPayment implements PaymentMethod {

        @Override
        public boolean pay(double amount) {
            if (amount <= 100000 && amount>0) {
                return true;
            }
            return false;
        }
    }



