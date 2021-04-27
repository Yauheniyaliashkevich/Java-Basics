package com.class32.HW;

import java.util.LinkedHashSet;

public class HW5 {
    /*
    Create the collection that will store single uniques
    Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        LinkedHashSet <String> set= new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        String sum="";
        for (String s:set
             ) {
            sum+=s;
        }

        System.out.println(sum);
    }



}
