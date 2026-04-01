package com.java.oops.Inheritance;

public class RegularCustomer extends Customer {
      double deliveryCharges;
      int maxOrderLimit;
      String deliveryTime;

    public RegularCustomer() {
        super();    }

    public RegularCustomer(int customerId, String customerName, long phoneNumber, String location, int orderCount, double deliveryCharges, int maxOrderLimit, String deliveryTime) {
        super(customerId, customerName, phoneNumber, location, orderCount);
        this.deliveryCharges = deliveryCharges;
        this.maxOrderLimit = maxOrderLimit;
        this.deliveryTime = deliveryTime;
    }

public void displayRegularCustomerDetails(){
    super.displayCustomerDetails();
        System.out.println("deliveryCharges :" +deliveryCharges);
        System.out.println("maxOrderLimit   :" +maxOrderLimit);
        System.out.println("deliveryTime    :" +deliveryTime);
    }
}

