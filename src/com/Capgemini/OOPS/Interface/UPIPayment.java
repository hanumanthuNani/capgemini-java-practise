package com.Capgemini.OOPS.Interface;

public class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
