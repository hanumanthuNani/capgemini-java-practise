package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public class SbiBank extends Bank {

    public SbiBank(PaymentGateWay paymentGateWay) {
        super(paymentGateWay);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Using SBI Bank");
        paymentGateWay.payment(amount);
    }
}
