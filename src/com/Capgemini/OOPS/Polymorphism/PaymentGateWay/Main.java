package com.Capgemini.OOPS.Polymorphism.PaymentGateWay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Bank Selection --------
        System.out.println("Select Bank:");
        System.out.println("1. SBI");
        System.out.println("2. HDFC");
        System.out.println("3. ICICI");
        System.out.print("Enter choice: ");
        int bankChoice = sc.nextInt();

        // -------- Payment Selection --------
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. PhonePe");
        System.out.println("2. GPay");
        System.out.println("3. Paytm");
        System.out.println("4. Debit Card");
        System.out.println("5. Credit Card");
        System.out.println("6. COD");
        System.out.print("Enter choice: ");
        int paymentChoice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        PaymentGateWay paymentGateWay = null;

        switch (paymentChoice) {
            case 1: paymentGateWay = new Phonepe(); break;
            case 2: paymentGateWay = new Gpay(); break;
            case 3: paymentGateWay = new Paytm(); break;
            case 4: paymentGateWay = new DebitCard(); break;
            case 5: paymentGateWay = new CreditCard(); break;
            case 6: paymentGateWay = new Cod(); break;
            default:
                System.out.println("Invalid payment option");
                return;
        }

        Bank bank = null;

        switch (bankChoice) {
            case 1: bank = new SbiBank(paymentGateWay); break;
            case 2: bank = new HdfcBank(paymentGateWay); break;
            case 3: bank = new IciciBank(paymentGateWay); break;
            default:
                System.out.println("Invalid bank option");
                return;
        }

        bank.makePayment(amount);
    }
}
