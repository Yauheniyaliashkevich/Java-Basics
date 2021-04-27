package com.class29;

import java.util.ArrayList;

public class HW {
    /*
         Create an ArrayList that will store 5 names into it.
     Find out whether the given ArrayList is empty or not?
     Check whether the specific name is present in an ArrayList or not?
     Find the size of your arrayList and print all values from that
    */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Jane");
        arrayList.add("Dasha");
        arrayList.add("Vlad");
        arrayList.add("Inna");
        arrayList.add("Vova");
        System.out.println("Is empty or not: "+arrayList.isEmpty());
        System.out.println("Is there a name: "+ arrayList.contains("Vlad"));
        System.out.println("Is there a name: "+ arrayList.contains("Vladik"));
        System.out.println("Size: "+ arrayList.size());
        System.out.println(arrayList);
    }
}
