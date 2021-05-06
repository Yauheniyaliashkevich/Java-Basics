package com.class33.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args)  {
        System.out.println("other code");
        System.out.println("other code");
        System.out.println("other code");
        String path = "/Users/yauheniyaliashkevich/Documents/Syntax/Book1.xlsx";
        //path=null;
        /*try {
            FileInputStream fileInputStream = new FileInputStream(path);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println(" File not found, try again ");
        }*/

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        }catch (Exception e){
            System.out.println(" File not found, try again ");

        }

        System.out.println("other code");
        System.out.println("other code");
        System.out.println("other code");
    }
}
