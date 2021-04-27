package com.class28.groupTask.Task1;

import com.class28.groupTask.Task1.Circle;
import com.class28.groupTask.Task1.Shape;
import com.class28.groupTask.Task1.Square;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape1=new Circle();
        shape1.calculateArea(10.5);
        shape1.calculatePerimeter(2.5);

        Shape shape2=new Square();
        shape2.calculateArea(10.5);
        shape2.calculatePerimeter(5.5);
    }
}
