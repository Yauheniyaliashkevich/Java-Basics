package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo102 {
    public static void main(String[] args) {
        String path="/Users/yauheniyaliashkevich/IdeaProjects/Java Basics/Files/Book1.xlsx";
        try {
            System.out.println("Try block 1");

            String name=null;
            name.length();
            System.out.println("Try block 2");
        }catch (NullPointerException exception){
            System.out.println("Catch block");
        }catch(Error nullPointerException){

        }
        System.out.println("Important code after try catch");
    }
}
