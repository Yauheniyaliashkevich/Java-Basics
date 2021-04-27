package com.class25.overriding;

public class KFather {
    String name;
    KFather(String name){
        this.name=name;
    }

    void eat(){
        System.out.println(name+" likes to eat rice");
    }
    void sleep(){
        System.out.println(name+" likes sleeps 6 hours");
    }
}
