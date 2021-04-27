package com.class22;

public class Animal22 {
    String name;
    int age;
    String color;


    public Animal22(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("Parametrized Parent");

    }
    public Animal22(){
        System.out.println("Parent");
    }



}
