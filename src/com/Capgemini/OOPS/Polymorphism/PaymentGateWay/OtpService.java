package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

import java.util.Scanner;
import java.util.Random;

public class OtpService {

    public boolean verifyOtp() {
        Scanner sc = new Scanner(System.in);

        // generate 4-digit OTP
        int generatedOtp = new Random().nextInt(9000) + 1000;

        System.out.println("OTP sent to registered mobile: " + generatedOtp);
        System.out.print("Enter OTP: ");

        int userOtp = sc.nextInt();

        if (userOtp == generatedOtp) {
            System.out.println("OTP verified successfully");
            return true;
        } else {
            System.out.println("Invalid OTP");
            return false;
        }
    }
}
