package com.java.oops.abstraction;

public  class RegularCustomer extends Customer {

    public RegularCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateDiscount(double amount) {
        return 0; // no discount
    }
}


