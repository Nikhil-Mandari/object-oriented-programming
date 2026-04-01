package com.java.oops.abstraction;

public abstract class Customer {
        int customerId;
        String customerName;

        public Customer(int customerId, String customerName) {
            this.customerId = customerId;
            this.customerName = customerName;
        }

        public void displayDetails() {
            System.out.println("Customer ID   : " + customerId);
            System.out.println("Customer Name : " + customerName);
        }

        public abstract double calculateDiscount(double amount);
    }

