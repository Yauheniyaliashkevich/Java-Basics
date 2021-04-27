package com.class21;

public class Child2 extends Parent2{
    //String name;

    Child2(String name){
        super(name);
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
