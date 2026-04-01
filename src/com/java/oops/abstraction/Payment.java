package com.java.oops.abstraction;

public abstract class Payment {

    public abstract void pay(double amount);

    public void postProcessing() {
        System.out.println("Order placed successfully ✅");
    }
}