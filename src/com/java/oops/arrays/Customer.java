package com.java.oops.arrays;

public class Customer {
        String id;
        String name;
        int age;
        String city;
        Long phoneNumber;

        public Customer(String id, String name, int age, String city, Long phoneNumber) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.city = city;
            this.phoneNumber = phoneNumber;
        }

        public void displayCustomerDetails(){
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("%-10s %-15s %-15d %-15s %-15s\n", id, name, age, city, phoneNumber);
        }
    }
