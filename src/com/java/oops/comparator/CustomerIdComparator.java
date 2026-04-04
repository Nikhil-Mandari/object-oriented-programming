package com.java.oops.comparator;

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        return Integer.compare(c1.getId(), c2.getId());
    }
}
