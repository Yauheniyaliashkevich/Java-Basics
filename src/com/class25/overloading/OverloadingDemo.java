package com.class25.overloading;

public class OverloadingDemo {
    void printInfo(String name){
        System.out.println("Name "+name);
    }
    void printInfo(String name,String address){
        System.out.println("Name "+name+" Address "+address);
    }
    void printInfo(String name,int phobeNumber, String address){
        System.out.println("Name "+name+" Phone Number "+phobeNumber+" Address "+address);
    }
    void doCalculate(){
        System.out.println(10/2);
    }

}
