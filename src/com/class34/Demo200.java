package com.class34;

import com.class27.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo200 {
    public static void main(String[] args) throws FileNotFoundException {

        int[] arr={10,20};
        int index=5;
        if(index >=arr.length || index<0){
            System.out.println("Index out of bound");
        }else{
            System.out.println(arr[5]);
        }

        int [] arr1 ={10,20};
        try{
            System.out.println(arr1[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound");
        }


        String name=null;
        if(name!=null){
            name.length();
        }else{
            System.out.println("Null object");
        }

        String path = "/Users/yauheniyaliashkevich/IdeaProjects/Java Basics/Files/Book1.xlsx";

        /*File file=new File(path);
        if(file.exists()){
            System.out.println("File found");
            FileInputStream fileInputStream=new FileInputStream(path);
        }
        else{
            System.out.println("File not found");
        }*/


    }
}
