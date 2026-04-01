package com.java.oops.arrays;

public class Main {


        public static Customer[] getCustomerFromString(String[] CustomersData){
            Customer[] customers = new Customer[CustomersData.length];
            for(int index = 0 ; index < CustomersData.length; index++){
                String[] split = CustomersData[index].split(",");
                Customer customer = new Customer(split[0], split[1], Integer.parseInt(split[2]), split[3], Long.parseLong(split[4]));
                customers[index] = customer;
            }
            return customers;
        }
        public static Order[] getOrderFromString(String[] OrdersData) {
            Order[] orders = new Order[OrdersData.length];
            for (int index = 0; index < OrdersData.length; index++) {
                String[] split = OrdersData[index].split(",");
                Order order = new Order(split[0], split[1], split[2], Integer.parseInt(split[3]), split[4], Double.parseDouble(split[5]), Boolean.parseBoolean(split[6]));
                orders[index] = order;
            }
            return orders;
        }

        public static void main(String[] args) {

            String[] customersData = {
                    "c-101,Rahul Sharma,25,Hyderabad,9876543210",
                    "c-102,Priya Reddy,30,Chennai,9123456780",
                    "c-103,Arjun Kumar,22,Bangalore,9988776655",
                    "c-104,Sneha Patel,28,Mumbai,9871234560",
                    "c-105,Vikram Singh,35,Delhi,9012345678",
                    "c-106,Anjali Gupta,27,Pune,9098765432",
                    "c-107,Kiran Rao,40,Hyderabad,9345678901",
                    "c-108,Meera Nair,24,Kochi,9567890123",
                    "c-109,Rohit Das,32,Kolkata,9874563210",
                    "c-110,Pooja Verma,29,Jaipur,9786543210"
            };

            Customer[] customers = getCustomerFromString(customersData);

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("                           CUSTOMER DETAILS                                  ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "ID", "NAME", "AGE", "CITY", "PhoneNumber");


            for(Customer customer : customers){
                customer.displayCustomerDetails();
                System.out.println();

            }
            //ORDER DATA
            String[] ordersData = {
                    "o-201,c-101,Lenovo Laptop,1,2026-03-10,58999,true",
                    "o-202,c-102,Dell Inspiron 15,1,2026-03-11,54999,false",
                    "o-203,c-103,HP Pavilion 14,1,2026-03-12,62999,true",
                    "o-204,c-104,Apple iPhone 14,2,2026-03-13,159998,true",
                    "o-205,c-105,Samsung Galaxy S23,1,2026-03-14,74999,false",
                    "o-206,c-106,OnePlus 11R,1,2026-03-15,45999,true",
                    "o-207,c-107,Boat Rockerz Headphones,3,2026-03-16,8997,true",
                    "o-208,c-108,Sony Bravia 43inch TV,1,2026-03-17,52999,false",
                    "o-209,c-109,Logitech Wireless Mouse,2,2026-03-18,2998,true",
                    "o-210,c-110,HP Laser Printer,1,2026-03-19,18999,false"
            };

            Order[] orders = getOrderFromString(ordersData);

            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                         ORDER DETAILS                                                  ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-15s %-15s %-30s %-15s %-15s %-15s %-15s\n","orderId","customerId","productName","quantity","dispatchDate","amount","isPaid");

            for (Order order : orders){
                order.displayOrderData();
            }

        }
    }








