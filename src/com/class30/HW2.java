package com.class30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HW2 {
    /*
    Create a Set collection in which you need to add names of the countries.
     In this set we want all objects to be sorted in alphabetical order.
      Using 2 different ways retrieve all elements from set.
     */
    public static void main(String[] args) {
        Set<String> county = new TreeSet<>();
        county.add("Belarus");
        county.add("Russia");
        county.add("USA");
        county.add("Peru");
        county.add("Ukraine");
        county.add("Canada");
        county.add("Poland");
        county.add("China");
        System.out.println(county);
        System.out.println("================1==============");
        Iterator<String> it= county.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("================2==============");

        for (String one:county
             ) {
            System.out.println(one);
        }






    }
}
