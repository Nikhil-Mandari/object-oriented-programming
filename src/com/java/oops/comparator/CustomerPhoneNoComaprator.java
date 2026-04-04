package com.java.oops.comparator;

import java.util.Comparator;

public class CustomerPhoneNoComaprator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2){
        return Long.compare(c1.getPhoneNo(), c2.getPhoneNo());
    }
}


