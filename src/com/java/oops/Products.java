package com.java.oops;

import java.util.List;

public class Products {

        String productType;
        int productId;
        String name;
        String brand;
        String model;
        double price;
        String color;
        int launchYear;
        float  discountPercentage;

        Products() {
            System.out.println("(Constructer) is called");
        }

        public Products(String productType, int productId, String name, String brand, String model, double price, String color, int launchYear, float  discountPercentage) {
            this.productType = productType;
            this.productId = productId;
            this.name = name;
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.color = color;
            this.launchYear = launchYear;
            this.discountPercentage=  discountPercentage;
        }

        //Business methods
        public void displayProductDetails() {
            System.out.println("Product Type        : " +productType);
            System.out.println("Product iD          : " +productId);
            System.out.println("Product Name        : " +name);
            System.out.println("Product Brand       : " +brand);
            System.out.println("Product Model       : " +model);
            System.out.println("Product Price       : " +price);
            System.out.println("Product  color      : " +color);
            System.out.println("Product LunchYear   : " +launchYear);
            System.out.println("Discount Percentage: " + discountPercentage);
        }

        public double getDiscountAmount(){
            return price * discountPercentage/100;
        }
        public double getFinalPrice(){
            return price -  getDiscountAmount();
        }

        public List<Products> getProductsPriceAbove(int price){
            System.out.println("Get the list of products price above "+ price);
            return null;
        }
    }





