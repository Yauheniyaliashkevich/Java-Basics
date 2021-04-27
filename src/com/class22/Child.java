package com.class22;

public class Child extends Parent {

    String color ="Red";

    void printColor(){
        System.out.println("Child class "+color);
        System.out.println("Parent class "+super.color);
    }
    void print(boolean shouldCallParent){
        if (shouldCallParent){
            super.printColor();
        }else {
            this.printColor();
        }
    }
}
