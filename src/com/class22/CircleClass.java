package com.class22;

public class CircleClass extends Shape{
    CircleClass(double radius){
        super(radius);
    }
    void calculate (){
        System.out.println(Math.pow(radius,2)*Math.PI);
        System.out.println(radius*radius*3.14);
    }

    public static void main(String[] args) {
        CircleClass circleClass=new CircleClass (2);
        circleClass.calculate();


    }
}
