package com.java.oops.comparator;

import java.util.List;

public class Main {
    static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);
        List<Customer> customers = customerService.sortByName();
        for (Customer customer : customers){
            System.out.println(customer);
        }
        System.out.println("___________________________________________");
        List<Customer>  customersByPhoneNo = customerService.sortByPhoneNo();
        for (Customer customer : customersByPhoneNo){
            System.out.println(customer);
        }
        System.out.println("=-----------------------------------------=");
        List<Customer> customersById = customerService.sortById();
        for (Customer customer : customersById){
            System.out.println(customer);
        }
    }





}
