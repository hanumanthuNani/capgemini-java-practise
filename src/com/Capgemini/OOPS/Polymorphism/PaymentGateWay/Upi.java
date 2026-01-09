package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public abstract class Upi extends PaymentGateWay {

    OtpService otpService = new OtpService();

    @Override
    public final void payment(double amount) {
        if (otpService.verifyOtp()) {
            processPayment(amount);
        } else {
            System.out.println("UPI payment failed due to OTP");
        }
    }

    protected abstract void processPayment(double amount);
}
