package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

public abstract class Cards extends PaymentGateWay {

    OtpService otpService = new OtpService();

    @Override
    public final void payment(double amount) {
        if (otpService.verifyOtp()) {
            processPayment(amount);
        } else {
            System.out.println("Card payment failed due to OTP");
        }
    }

    protected abstract void processPayment(double amount);
}
