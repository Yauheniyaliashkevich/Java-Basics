package com.class22;

import java.sql.SQLOutput;

public class DogClass22 extends Animal22{
    String breed;

    DogClass22(){
        System.out.println("Child");
    }

    DogClass22 (String name, int age, String color,
                String breed){
        super(name,age,color);
        this.breed=breed;
        System.out.println("Parametrized Child");
    }

    void printInfo(){
        System.out.println(name+" age "+age+" breed "+breed);
    }
}
