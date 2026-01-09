package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public abstract class Bank {

    protected PaymentGateWay paymentGateWay;

    public Bank(PaymentGateWay paymentGateWay) {
        this.paymentGateWay = paymentGateWay;
    }

    public abstract void makePayment(double amount);
}
