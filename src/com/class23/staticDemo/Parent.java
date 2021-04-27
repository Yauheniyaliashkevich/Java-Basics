package com.class23.staticDemo;

public class Parent {

    static void method1(){
        System.out.println("from parent");
    }

    static void printInfo (String name){
        System.out.println("name from parent "+name);
    }

}
class Child extends Parent{

    static void printInfo(String name){
        System.out.println("Name from Child "+name);
    }

    static void method1(){
        System.out.println("from child");
    }

    public static void main(String[] args) {
        Child.printInfo("Yuliya");
        Child.method1();
    }
}
