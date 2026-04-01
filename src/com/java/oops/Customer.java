package com.java.oops;

public class Customer {
    //state
    int id;
    String name;
    String email;
    String password;
    byte age;
    long mobileNo;
    char gender;
    String address;
    boolean isActive;

    Customer(){
        System.out.println("Constructer() is called ");

    }

    public Customer(int id, String name, String email, String password, byte age, long mobileNo, char gender, String address, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.mobileNo = mobileNo;
        this.gender = gender;
        this.address = address;
        this.isActive = isActive;
    }
}
