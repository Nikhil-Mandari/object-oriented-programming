package com.java.oops.comparator;

import java.util.List;

public class CustomerService {
    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
     public List<Customer> sortByName(){
        List<Customer> customers = this.customerRepository.getAll();
        customers.sort(new CustomerNameComparator());
        return customers;
     }
     public List<Customer> sortByPhoneNo(){
        List<Customer> customers = this.customerRepository.getAll();
        customers.sort(new CustomerPhoneNoComaprator());
        return customers;
     }
     public List<Customer> sortById(){
        List<Customer> customers = this.customerRepository.getAll();
        customers.sort(new CustomerIdComparator());
        return customers;
     }
}
