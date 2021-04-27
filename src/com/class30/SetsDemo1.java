package com.class30;

import java.util.*;
import java.util.logging.Handler;

public class SetsDemo1 {
    public static void main(String[] args) {
        Set<String> names =new TreeSet<>();
        names.add("Afzal");
        names.add("Gul");
        names.add("Yarina");
        names.add("Caner");
        names.add("Ty");
        names.add("Gul");


        ArrayList<String> listFromSet= new ArrayList<>(names);
       System.out.println(names);

        for (String name:names
             ) {
            System.out.println(name);

        }

        for (int i = 0; i <names.size() ; i++) {
            System.out.println(listFromSet.get(i));
        }






    }
}
