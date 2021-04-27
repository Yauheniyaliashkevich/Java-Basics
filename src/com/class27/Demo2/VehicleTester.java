package com.class27.Demo2;

public class VehicleTester {
    public static void main(String[] args) {

        BMW bmw=new BMW("1234GSCSN", "Sedan","BMW","X5");
        bmw.start();
        bmw.stop();
        bmw.speed();
        bmw.drive();
        bmw.display();

        Vehicle vehicle=new Toyota("123ds","SUV", "Toyota","RAV4");
        //vehicle.display();
        vehicle.drive();
        vehicle.stop();


    }
}
