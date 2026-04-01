package com.java.oops.strings;

public class Order {

        String orderId;
        String customerId;
        String productName;
        int quantity;
        String dispatchDate;
        double amount;
        boolean isPaid;

        public Order(String orderId, String customerId, String productName, int quantity, String dispatchDate, double amount, boolean isPaid) {
            this.orderId = orderId;
            this.customerId = customerId;
            this.productName = productName;
            this.quantity = quantity;
            this.dispatchDate = dispatchDate;
            this.amount = amount;
            this.isPaid = isPaid;
        }

        public void displayOrderData() {
            System.out.printf("%-15s %-15s %-30s %-15d %-15s %-15f %-15s\n", orderId, customerId, productName, quantity, dispatchDate, amount, isPaid);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        }
    }


