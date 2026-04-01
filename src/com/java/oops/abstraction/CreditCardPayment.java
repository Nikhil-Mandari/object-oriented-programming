package com.java.oops.abstraction;

public class CreditCardPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}