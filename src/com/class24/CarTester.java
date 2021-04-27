package com.class24;

public class CarTester {
    public static void main(String[] args) {
        Car car1=new BMW();
        car1.start(); // method from child will be called because we have overrider it
        car1.stop(); // method from parent will be called because we have overrider it
        //bmw.driffting(); CE not allowed by using parent reference

        BMW bmw1=(BMW)car1; // because now we have converted our reference back to BMW
        bmw1.driffting();

        Car car=new Tesla();
        BMW bmw2=(BMW)car;

    }
}
