package com.java.oops.model;

public class Main {

        static void main(String[] args) {
            Customer customer = new Customer();
            customer.setId(101)
                    .setName("customer1")
                    .setEmail("customer1@gmail.com")
                    .setPhoneNo(9876543210L)
                    .setActive(true)
                    .setPassword("customer@123");

            System.out.println("-----------------------------------------------------------------");
            System.out.println("                     CUSTOMER DETAILS                     ");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ID        : " + customer.getId());
            System.out.println("Name      : " + customer.getName());
            System.out.println("Email     : " + customer.getEmail());
            System.out.println("Phone No  : " + customer.getPhoneNo());
            System.out.println("Active    : " + customer.isActive());
            System.out.println(customer);

            System.out.println("----------------------------------------------------------------");

            Product product = new Product();
            product.setProductName("IPhone 15Pro MAX")
                    .setQuantity(03)
                    .setPrice(14000)
                    .setTotalAmount(420000);

            System.out.println("                     PRODUCT DETAILS                     ");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Product Name           :  "+ product.getProductName());
            System.out.println("Product Quantity       : "+ product.getQuantity());
            System.out.println("Product Price          : "+ product.getPrice());
            System.out.println("Product TotalAmount    : "+ product.getTotalAmount());
            System.out.println(product);

            Order order = new Order();
            order.setOrderid(407)
                    .setCustomerName("Nikhil")
                    .setOrderDate("12-03-2026")
                    .setOrderName("Laptop")
                    .setOrderStatus("Out for Delivery");

            System.out.println("-----------------------------------------------------------------");
            System.out.println("                     ORDER DETAILS                     ");
            System.out.println("-----------------------------------------------------------------");

            System.out.println("Order Id    : "+ order.getOrderid());
            System.out.println("Order Name  : "+ order.getCustomerName());
            System.out.println("Order Name  : "+ order.getOrderName());
            System.out.println("Order Date  : "+ order.getOrderDate());

            System.out.println("Order Status : "+ order.getOrderStatus());

            System.out.println(order);
            System.out.println();

        }
    }


