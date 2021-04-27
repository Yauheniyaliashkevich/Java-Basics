package com.class31.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries = new LinkedHashMap<>();
        groceries.put("Eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("potato",10.0);
        System.out.println(groceries);

        //groceries.keySet().removeIf(key ->key.contains("o")); //functional programing

        Iterator<String > iterator=groceries.keySet().iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            if(key.contains("o")){
                iterator.remove();
            }
        }
        System.out.println(groceries);

    }
}
