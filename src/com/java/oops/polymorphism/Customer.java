package com.java.oops.polymorphism;

public class Customer {
    int customerId;
    String customerName;
    long phoneNumber;
    String location;
    int  orderCount;

    public Customer() {
        System.out.println("customer() customer called");
    }

    public Customer(int customerId, String customerName, long phoneNumber, String location, int orderCount) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.orderCount = orderCount;
    }

    public void displayDetails(){
        System.out.println("Customer ID     : "+customerId);
        System.out.println("Customer Name     : "+customerName);
        System.out.println("Customer Phone No : "+phoneNumber);
        System.out.println("Customer Location : "+location);
        System.out.println("No Of Orders      : "+orderCount);


    }
}
