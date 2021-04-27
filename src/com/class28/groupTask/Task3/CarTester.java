package com.class28.groupTask.Task3;

public class CarTester {
    public static void main(String[] args) {
        Car truck=new Truck(2000.0, "Blue", 3000.0);
        System.out.println(truck.calculateSalePrice());
        Car sedan=new Sedan(1000.0, "White", 30);
        System.out.println(sedan.calculateSalePrice());
    }

}
