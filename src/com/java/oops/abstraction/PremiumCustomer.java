package com.java.oops.abstraction;

public class PremiumCustomer extends Customer {

    String type; // Gold or Silver

    public PremiumCustomer(int id, String name, String type) {
        super(id, name);
        this.type = type;
    }

    @Override
    public double calculateDiscount(double amount) {
        if (type.equalsIgnoreCase("Gold")) {
            return amount * 0.20; // 20% discount
        } else {
            return amount * 0.10; // 10% discount
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Customer Type : " + type);
    }
}