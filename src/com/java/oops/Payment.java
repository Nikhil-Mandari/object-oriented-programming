package com.java.oops;

public class Payment {
        String name;
        String  mobileNumber;
        String billingAddress;
        int orderID;
        int totalAmount;
        String paymentType;
        String cardHolderName;
        String cardNumber;;
        String expiryDate;  // "12/28"    String cvv;
        String otp;

        Payment(){
            System.out.println("(constructor) is called");
        }

        public Payment(String name, String mobileNumber, String billingAddress, int orderID, int totalAmount, String paymentType, String cardHolderName, String cardNumber, String expiryDate, String otp) {
            this.name = name;
            this.mobileNumber = mobileNumber;
            this.billingAddress = billingAddress;
            this.orderID = orderID;
            this.totalAmount = totalAmount;
            this.paymentType = paymentType;
            this.cardHolderName = cardHolderName;
            this.cardNumber = cardNumber;
            this.expiryDate = expiryDate;
            this.otp = otp;
        }
    }



