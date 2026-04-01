package com.java.oops.abstraction;

public class Main {

    public static void main(String[] args) {


        Customer customer = new PremiumCustomer(101, "Nikhil", "gold");
        Payment payment = new DebitCardPayment();

        CustomerService service = new CustomerService();

        service.processOrder(customer, payment, 2500);
    }
}