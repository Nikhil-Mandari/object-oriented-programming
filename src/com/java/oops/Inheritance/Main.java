package com.java.oops.Inheritance;

public class Main {
    public static void main(String[] args) {

        RegularCustomer  regularCustomer = new RegularCustomer(101,"Sailu",7729076343l,"Medak",2,50,5,"30min");
        PremiumCustomer premiumCustomer = new PremiumCustomer(102,"Yahoda",8464032131l,"Thimmaipally",3,"Gold",50,true);
        System.out.println("-----Regular customer------");
        regularCustomer.displayRegularCustomerDetails();
        System.out.println();
        System.out.println("-----premium customer------");
        premiumCustomer.displayPremiumCustomerDetails();
    }

}
