package com.java.oops.abstraction;

public class DebitCardPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card");
    }
}