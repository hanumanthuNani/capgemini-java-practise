package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public class DebitCard extends Cards {

    @Override
    protected void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card");
    }
}
