package com.java.oops.model;

public class Product {

        private String productName;
        private int quantity;
        private double price;
        private double totalAmount;

        public String getProductName() {
            return productName;
        }

        public Product setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public int getQuantity() {
            return quantity;
        }

        public Product setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public double getPrice() {
            return price;
        }

        public Product setPrice(double price) {
            this.price = price;
            return this;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public Product setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        @Override
        public String toString() {
            return "product{" +
                    "productName='" + productName + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    ", totalAmount=" + totalAmount +
                    '}';
        }
    }


