package com.class28.groupTask.Task1;

public interface Shape {
    /*

     */
     void calculateArea(double a);
     void calculatePerimeter(double a);
}
class Circle implements Shape{

    @Override
    public void calculateArea(double a) {
        System.out.println("Area of the circle is "+a*a*Math.PI);
    }

    @Override
    public void calculatePerimeter(double a) {
        System.out.println("Perimeter of the circle is "+2*Math.PI*a);
    }
}

class Square implements Shape{

    @Override
    public void calculateArea(double a) {
        System.out.println("Area of the circle is "+a*a);
    }

    @Override
    public void calculatePerimeter(double a) {
        System.out.println("Perimeter of the square is "+a*4);
    }
}