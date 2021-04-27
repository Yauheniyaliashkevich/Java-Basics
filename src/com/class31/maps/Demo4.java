package com.class31.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries = new LinkedHashMap<>();
        groceries.put("Eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("potato",10.0);

        Set<String > mapKeys=groceries.keySet();
        for (String key:mapKeys
             ) {
            System.out.println(key+ " "+ groceries.get(key));

        }

    }
}
