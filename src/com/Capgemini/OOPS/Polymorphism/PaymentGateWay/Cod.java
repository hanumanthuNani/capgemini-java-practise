package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public class Cod extends PaymentGateWay {

    @Override
    public void payment(double amount) {
        System.out.println("Pay ₹" + amount + " on delivery");
    }
}
