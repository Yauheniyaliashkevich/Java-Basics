package com.class19;

public class ConstructorDemo4 {
    String name;
    ConstructorDemo4(){
        System.out.println("Empty parameter constructor");
    }
    ConstructorDemo4(String name){
        this();
        System.out.println("Parameterized constructor");

    }
    void printInfo(){
        printName();
        System.out.println(name);
    }
    void printName(){
        System.out.println("Jane");
    }

    public static void main(String[] args) {
        ConstructorDemo4 obj=new ConstructorDemo4();
        new ConstructorDemo4("Alec");

        obj.printInfo();

    }
}
