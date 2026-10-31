package day11;

public class Day11Test {

    public static void main(String[] args) {

        PaymentMethod upiPayment = new UpiPayment();
        PaymentMethod neftPayment = new NeftPayment();

        System.out.println("is payment succeeded : " + upiPayment.pay(0)); //expected: false
        System.out.println("is payment succeeded : " + upiPayment.pay(100000)); //expected: true
        System.out.println("is payment succeeded : " + upiPayment.pay(100001)); //expected: false

        System.out.println("is payment succeeded : " + neftPayment.pay(100001)); //expected: true
        System.out.println("is payment succeeded : " + neftPayment.pay(0)); //expected: false
        System.out.println("is payment succeeded : " + neftPayment.pay(1)); //expected: true
        System.out.println("is payment succeeded : " + neftPayment.pay(2)); //expected: true

    }
}
