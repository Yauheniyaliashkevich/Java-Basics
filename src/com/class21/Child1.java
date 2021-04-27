package com.class21;


public class Child1 extends Parent1 {
    public Child1(int num1, int num2, String name){

        super(num1,num2,name);
    }

    int average(){
        return super.add()/2;

    }
    int add(){
        return num1+num2-10;
    }
}
