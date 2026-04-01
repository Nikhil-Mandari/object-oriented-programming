package com.java.oops;


public class Main {
    static void main(String[] args) {
        Customer customer1 = new Customer(101, "Nikhil", "Nikhil123@gmail.com", "Nikhil987", (byte) 22, 9014995301l, 'M', "Thimmaipally", true);

            System.out.println("--CUSTOMER1 DETAILS--");
            System.out.println("Id       :" + customer1.id);
            System.out.println("NAME     :" + customer1.name);
            System.out.println("Email    :" + customer1.email);
            System.out.println("Age      : " + customer1.age);
            System.out.println("Mobile no:" + customer1.mobileNo);
            System.out.println("Password :" + customer1.password);
            System.out.println("Gender   :" + customer1.gender);
            System.out.println("Adress   :" + customer1.address);
            System.out.println("isActive :" + customer1.isActive);
            System.out.println();

            Customer customer2 = new Customer(102, "Sailu", "Sailu@gmail.com", "sailu@123", (byte) 50, 772907634, 'M', "MEDAK,TELANGANA 502113", true);

            System.out.println("--CUSTOMER2 DETAILS--");
            System.out.println("Id        :" + customer2.id);
            System.out.println("NAME      :" + customer2.name);
            System.out.println("Email     :" + customer2.email);
            System.out.println("Age       : " + customer2.age);
            System.out.println("Mobile no :" + customer2.mobileNo);
            System.out.println("Password  :" + customer2.password);
            System.out.println("Gender    :" + customer2.gender);
            System.out.println("Adress    :" + customer2.address);
            System.out.println("isActive  :" + customer2.isActive);
            System.out.println();

            System.out.println("---- PRODUCTS DETAILS-------");

            Products Product1 = new Products("Electronics", 9014, "Phone", "Apple", "IPhone17pro", 140000, "Orange", 2026,50);

            System.out.println("Product Type        : " + Product1.productType);
            System.out.println("Product iD          : " + Product1.productId);
            System.out.println("Product Name        : " + Product1.name);
            System.out.println("Product Brand       : " + Product1.brand);
            System.out.println("Product Model       : " + Product1.model);
            System.out.println("Product Price       : " + Product1.price);
            System.out.println("Product  color      : " + Product1.color);
            System.out.println("Product LunchYear   : " + Product1.launchYear);

            Products Product2 = new Products("Electronics", 7729, "Washing Machine", "Samsung", "S123", 45000, "Red", 2020,50);
            System.out.println("----PRODUCTS2 DETAILS----");

            System.out.println("Product Type        : " + Product2.productType);
            System.out.println("Product iD          : " + Product2.productId);
            System.out.println("Product Name        : " + Product2.name);
            System.out.println("Product Brand       : " + Product2.brand);
            System.out.println("Product Model       : " + Product2.model);
            System.out.println("Product Price       : " + Product2.price);
            System.out.println("Product  color      : " + Product2.color);
            System.out.println("Product LunchYear   : " + Product2.launchYear);
            System.out.println();

            Payment payment = new Payment("NIKHIL", "9014995301", "Medak-Thimmaipally-502113", 987987, 1200, "NET BANKING", "SAILU MANDARI", "39966004747", "12/30", "9879");

            System.out.println("----PAYMENT-DETAILES----");

            System.out.println("NAME              : " + payment.name);
            System.out.println("MobileNumber      : " + payment.mobileNumber);
            System.out.println("BillingAdress     : " + payment.billingAddress);
            System.out.println("OrderId           : " + payment.orderID);
            System.out.println("TotalAmount       : " + payment.totalAmount);
            System.out.println("PaymentType       : " + payment.paymentType);
            System.out.println("CardHolderName    : " + payment.cardHolderName);
            System.out.println("CardNumber        : " + payment.cardNumber);
            System.out.println("ExpiryDate        : " + payment.expiryDate);
            System.out.println("OTP               : " + payment.otp);
            System.out.println();

            System.out.println("----Business Model------");

            Products products = new Products("Washing mechine",114,"SUMSANG","Apple","2026",14000,"Black",2026,25);
            products.displayProductDetails();
            System.out.println("---payment-----");
            System.out.println();
            System.out.println("Product Price  : "+products.price);
            System.out.println("DiscountAmount:  "+products.getDiscountAmount());
            System.out.println("Final Price:     "+products.getFinalPrice());


        }
    }


