package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public class HdfcBank extends Bank {

    public HdfcBank(PaymentGateWay paymentGateWay) {
        super(paymentGateWay);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Using HDFC Bank");
        paymentGateWay.payment(amount);
    }
}
