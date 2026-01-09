package com.Capgemini.OOPS.Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        Bank bank;

        bank = new SBI();
        bank.getInterestRate();

        bank = new HDFC();
        bank.getInterestRate();
    }
}
