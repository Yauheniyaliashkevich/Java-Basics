package com.class28.demo3;

public abstract class Parent {
   protected abstract void method1();
}
class Child extends Parent{

    @Override
    public void method1(){
        System.out.println("Abstract method");
    }
}
