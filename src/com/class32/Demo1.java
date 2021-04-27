package com.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        String path ="/Users/yauheniyaliashkevich/IdeaProjects/Java Basics/Files/Configuration.properties";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path); //open
        Properties properties=new Properties(); // it is kind of our reader / word
        properties.load(fileInputStream); //connection their both
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("userName"));
        //int iterations = Integer.parseInt(properties.get("loop").toString());
        int iterations = Integer.parseInt(properties.getProperty("loop"));
        for (int i = 0; i < iterations; i++) {
            System.out.println("Dynamic program");

        }

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.setProperty("name", "Ghulam"); //add something to file
        properties.store(fileOutputStream, "Added new property in the file");





    }
}
