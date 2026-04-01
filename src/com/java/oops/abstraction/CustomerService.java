package com.java.oops.abstraction;

public class CustomerService {

    public void processOrder(Customer customer, Payment payment, double amount) {

        customer.displayDetails();

        double discount = customer.calculateDiscount(amount);
        double finalAmount = amount - discount;

        System.out.println("Original Amount : " + amount);
        System.out.println("Discount        : " + discount);
        System.out.println("Final Amount    : " + finalAmount);

        payment.pay(finalAmount);
        payment.postProcessing();
    }
}