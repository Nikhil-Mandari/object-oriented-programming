package com.java.oops.strings;

public class Main {

        public static Order[] getOrderFromString(String[] OrdersData){
            Order[] orders = new Order[OrdersData.length];
            for (int index = 0; index < OrdersData.length; index++){
                String[] split = OrdersData[index].split(",");
                Order order = new Order(split[0], split[1], split[2], Integer.parseInt(split[3]),split[4],Double.parseDouble(split[5]), Boolean.parseBoolean(split[6]));
                orders[index] = order;
            }
            return orders;
        }

        public static void main(String[] args) {
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
            System.out.printf("%-15s %-15s %-30s %-15s %-15s %-15s %-15s\n","orderId","customerId","productName","quantity","dispatchDate","amount","isPaid");
            for (Order order : orders){
                order.displayOrderData();
            }

        }
    }

