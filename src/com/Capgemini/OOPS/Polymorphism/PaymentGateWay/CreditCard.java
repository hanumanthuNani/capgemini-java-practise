package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public class CreditCard extends Cards {

    @Override
    protected void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}
