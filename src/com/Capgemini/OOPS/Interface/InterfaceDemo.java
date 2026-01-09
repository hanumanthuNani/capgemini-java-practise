package com.Capgemini.OOPS.Interface;

public class InterfaceDemo {
    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(1000);

        payment = new UPIPayment();
        payment.pay(500);
    }
}
