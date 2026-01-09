package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public class Gpay extends Upi {

    @Override
    protected void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using GPay");
    }
}
