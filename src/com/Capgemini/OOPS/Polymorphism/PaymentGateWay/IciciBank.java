package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public class IciciBank extends Bank {

    public IciciBank(PaymentGateWay paymentGateWay) {
        super(paymentGateWay);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Using ICICI Bank");
        paymentGateWay.payment(amount);
    }
}
