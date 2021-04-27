package com.class28.groupTask.Task3;

public abstract class Car {
    double carPrice;
    String color;
    Car(double carPrice, String color) {
        this.carPrice=carPrice;
        this.color=color;
    }
    abstract double calculateSalePrice();
}
class Truck extends Car{
    double weight;
    Truck(double carPrice, String color, double weight){
        super(carPrice, color);
        this.weight=weight;
    }
    double calculateSalePrice() {
        if(weight>2000) {
            carPrice-=carPrice*0.05;
        }else {
            carPrice-=carPrice*0.1;
        }
        return carPrice;
    }}
class Sedan extends Car {
    int length;

    Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    double calculateSalePrice() {
        if (length > 20) {
            carPrice -= carPrice * 0.05;
        } else {
            carPrice -= carPrice * 0.1;
        }
        return carPrice;
    }
}

