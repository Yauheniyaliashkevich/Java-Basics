package com.class30;

import java.util.*;

public class HW1 {
    /*
    How can you remove all duplicates from ArrayList?
    List<String> aList=new ArrayList<>();
    aList.add("John");
    aList.add("Jane");
    aList.add("James");
    aList.add("Jasmine");
    aList.add("Jane");
    aList.add("James");
     */
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        Set<String> aLists = new LinkedHashSet<>(aList);
        ArrayList<String> removeElements= new ArrayList<>(aLists);
        System.out.println(removeElements);
    }
}
