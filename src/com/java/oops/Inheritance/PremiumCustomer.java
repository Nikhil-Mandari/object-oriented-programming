package com.java.oops.Inheritance;

public class PremiumCustomer extends Customer {

    String membershipType;
    double discountPercentage;
    boolean freeDelivery;

    public PremiumCustomer() {
        super();
    }

    public PremiumCustomer(int customerId, String customerName, long phoneNumber, String location, int orderCount, String membershipType, double discountPercentage, boolean freeDelivery) {
        super(customerId, customerName, phoneNumber, location, orderCount);
        this.membershipType = membershipType;
        this.discountPercentage = discountPercentage;
        this.freeDelivery = freeDelivery;
    }


    public void displayPremiumCustomerDetails() {
        super.displayCustomerDetails();

        System.out.println("membershipType     : " + membershipType);
        System.out.println("discountPercentage :" + discountPercentage);
        System.out.println("freeDelivery       :" + freeDelivery);

    }
}




