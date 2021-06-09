package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo103 {
    public static void main(String[] args) {
        System.out.println("Before try block");
        String path="/Users/yauheniyaliashkevich/IdeaProjects/Java Basics/Files/Book1.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            System.out.println("Try block");
        } catch (FileNotFoundException fileNotFoundException) {
            //fileNotFoundException.printStackTrace();
            System.out.println("The file that you are trying to read from this path "+path+" is not present there");
            System.out.println("Catch block");
        }
        System.out.println("After catch block");

    }
}
