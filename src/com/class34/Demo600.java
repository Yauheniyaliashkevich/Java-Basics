package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo600 {

    public static void main(String[] args) {
        String path ="/Users/yauheniyaliashkevich/IdeaProjects/Java Basics/Files/Book1.xlsx";
        FileInputStream fileInputStream=null;
        try{
            fileInputStream=new FileInputStream(path);
            System.out.println("Next line of code in try block");
        }catch(FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }finally { // always execute
            try {
                //System.out.println(10/0);
                System.out.println("Will always be executed");
                fileInputStream.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        System.out.println(10/0);

    }
}
