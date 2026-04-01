package com.java.oops.collections;

import com.java.oops.model.Order;

public class OrderService {
    public void displayOrders(Order order){
        System.out.println("Order id : "+order.getOrderid());
        System.out.println("Order Name :"+order.getOrderName());
        System.out.println("Order date :"+order.getOrderDate());
        System.out.println("Order status :"+order.getOrderStatus());

    }

}
