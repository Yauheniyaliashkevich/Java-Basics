package com.class19;

public class HW1DifferentConstructors {
    HW1DifferentConstructors (){
        System.out.println("defauld constructor");
    }
    private HW1DifferentConstructors (String name){
        System.out.println("private constructor");
    }
    public HW1DifferentConstructors(int age){
        System.out.println("public constructor");
    }
    protected HW1DifferentConstructors(double salary){
        System.out.println("protected constructor");
    }

    public static void main(String[] args) {
        HW1DifferentConstructors obj=new HW1DifferentConstructors ();
    }
}
