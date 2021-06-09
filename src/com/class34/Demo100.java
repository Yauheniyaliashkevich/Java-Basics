package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo100 {
    public static void main(String[] args) {
        String path="/Users/yauheniyaliashkevich/IdeaProjects/Java Basics/Files/Book1.xlsx";
        try {
            System.out.println("Try block 1");
            FileInputStream fileInputStream = new FileInputStream(path);
            /*String name=null;
            name.length();*/
            System.out.println("Try block 2");
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("Catch block");
        }
        System.out.println("Important code after try catch");
    }
}
