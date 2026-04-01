package com.java.oops.collections;


import com.java.oops.model.Order;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class OrderSet {

    static void main(String[] args) {
        HashSet<Order> orders = new HashSet<>();
        Order order1 = new Order();
        order1.setOrderid(401)
                .setCustomerName("Nikhil")
                .setOrderDate("12-03-2026")
                .setOrderName("Laptop")
                .setOrderStatus("Out for Delivery");
        Order order2 = new Order();
        order2.setOrderid(402)
                .setCustomerName("Rithik")
                .setOrderDate("25-03-2026")
                .setOrderName("Book")
                .setOrderStatus("Out for Delivery");
        Order order3 = new Order();
        order3.setOrderid(403)
                .setCustomerName("sunny")
                .setOrderDate("30-03-2026")
                .setOrderName("Phone")
                .setOrderStatus("Out for Delivery");
        Order order4 = new Order();
        order4.setOrderid(404)
                .setCustomerName("Ashok")
                .setOrderDate("29-03-2026")
                .setOrderName("Watch")
                .setOrderStatus("Out for Delivery");

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);

        System.out.println(orders);

        Iterator<Order> iterator = orders.iterator();
        Order order = null;
        OrderService orderService = new OrderService();
        while (iterator.hasNext()) {
            order = iterator.next();
            System.out.println(order);
            orderService.displayOrders(order);
            System.out.println();

        }
    }

    }


