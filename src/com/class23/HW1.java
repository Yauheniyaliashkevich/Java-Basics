package com.class23;

public class HW1 {

    /*
    Create 1 class in which create a methods that will calculate the area (volume) of
    Rectangle
    Square
    Box
    Use separate class to test your code
     */

    public int rectangle (int length, int width){
        int areaRec=length*width;
        return areaRec;
    }
    public int square (int length){
        int areaSq=length*length;
        return areaSq;
    }
    public int box (int length, int width, int height){
        int areaBox=length*width*height;
        return areaBox;
    }


    public static void main(String[] args) {
        HW1 obj1=new HW1();
        System.out.println("The area of rectangle is "+obj1.rectangle(20,30));

        HW1 obj2=new HW1();
        System.out.println("The area of square is "+obj2.square(25));

        HW1 obj3=new HW1();
        System.out.println("The area of box is "+obj3.box(10,5,15));
    }




}
