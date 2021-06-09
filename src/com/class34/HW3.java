package com.class34;

public class HW3 {
    /*
    Create a method to check age eligibility that will throw a runtime exception.
     Method should throw an exception age is less than 16.
     */
    public static void main(String[] args) {
        int x=10;
        if(x<16){
            throw new RuntimeException("You should study");
            //System.out.println("(main:12 )Error, You should study");
        }else {
            System.out.println("You should work");
        }
    }
}
