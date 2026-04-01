package com.java.oops.model;

import java.util.Objects;

public class Order {

        private int orderid;
        private String customerName;
        private String orderName;
        private  String orderDate;
        private String orderStatus;

        public Order() {
        }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderid == order.orderid && Objects.equals(customerName, order.customerName) && Objects.equals(orderName, order.orderName) && Objects.equals(orderDate, order.orderDate) && Objects.equals(orderStatus, order.orderStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderid, customerName, orderName, orderDate, orderStatus);
    }

    public int getOrderid() {
            return orderid;
        }

        public Order setOrderid(int orderid) {
            this.orderid = orderid;
            return this;
        }

        public String getCustomerName() {
            return customerName;
        }

        public Order setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public String getOrderName() {
            return orderName;
        }

        public Order setOrderName(String orderName) {
            this.orderName = orderName;
            return this;
        }

        public String getOrderDate() {
            return orderDate;
        }

        public Order setOrderDate(String orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public Order setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "orderid=" + orderid +
                    ", customerName='" + customerName + '\'' +
                    ", orderName='" + orderName + '\'' +
                    ", orderDate='" + orderDate + '\'' +
                    ", orderStatus='" + orderStatus + '\'' +
                    '}';
        }
    }


