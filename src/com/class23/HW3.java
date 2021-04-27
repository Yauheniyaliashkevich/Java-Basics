package com.class23;

public class HW3 {

    /*
    Create 1 class with a static method that has 3 overloaded forms. Then call each
    overloaded method with specific arguments and observe result.
   Create 1 class with a private method that has 3 overloaded forms. Then call each
   overloaded method with specific arguments and observe result.
     */

    static void method1(){
        System.out.println("Nothing");
    }
    static void method1(String name){
        System.out.println("My name is "+name);
    }
    static void method1(String name, int age){
        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }

    private void method2(){
        System.out.println("Nothing");
    }
    private void method2(String name){
        System.out.println("My name is "+name);
    }
    private void method2(String name, int age){
        System.out.println("My name is "+name+" and I am "+age+" years old");
    }

    public static void main(String[] args) {
        method1();
        method1("Dasha");
        method1("Jane",29);

        HW3 hw3=new HW3();
        hw3.method2();
        hw3.method2("Dasha");
        hw3.method2("Jane",29);
    }
}
