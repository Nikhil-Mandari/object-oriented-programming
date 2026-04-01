package com.java.oops.polymorphism;

public class PremiumCustomer extends Customer {

    String membershipType;


    public PremiumCustomer() {

        super();//SUPER CLASS CONSTRUCTOR CALL
    }

    public PremiumCustomer(int customerId, String customerName, long phoneNumber, String location, int orderCount, String membershipType) {
        super(customerId, customerName, phoneNumber, location, orderCount);
        this.membershipType = membershipType;
    }

@Override
    public void displayDetails() {
    super.displayDetails();
    System.out.println("membershipType     : " + membershipType);
        if (membershipType.equalsIgnoreCase("gold")) {
            System.out.println("discountPercentage = 50%");
            System.out.println("Delivery           = freeDelivery");
        } else {
            System.out.println("discountPercentage = 10%");
            System.out.println("Delivery           = 20$ charge");
        }
    }
}








