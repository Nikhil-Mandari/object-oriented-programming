package com.java.oops.polymorphism;

public class Main {
    public static void main(String[] args) {


        CustomerService customerService = new CustomerService();
        RegularCustomer regularCustomer = new RegularCustomer(101,"yashoda",8464032131L,"Medak",6,30,5,"30min");
        System.out.println("------------RegularCustomer-------------");
        customerService.displayDetails(regularCustomer);
        System.out.println();

        PremiumCustomer premiumCustomer = new PremiumCustomer(102,"NIKHIL",9014995301L,"kukatpally",3,"silver");
        System.out.println("-----------premiumCustomer------------");
        customerService.displayDetails(premiumCustomer);
    }

}
