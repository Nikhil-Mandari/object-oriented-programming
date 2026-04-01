package com.java.oops.abstraction;

public class UpiPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
