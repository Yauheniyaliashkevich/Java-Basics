package com.class32.HW;

import java.lang.reflect.Array;
import java.util.*;

public class HW2 {
    /*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        Map<Integer, String> bestBuy= new LinkedHashMap<>();
        bestBuy.put(123456, "Printer");
        bestBuy.put(334678, "TV");
        bestBuy.put(543278, "Phone");
        bestBuy.put(975452, "Blender");
        bestBuy.put(241646, "Case");

       // Iterator<Map.Entry<Integer,String>>  entrySet = bestBuy.entrySet().iterator();
        Set<Map.Entry<Integer,String>> entrySet=bestBuy.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = bestBuy.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("===============for each ==========");
        //HashMap<TreeMap<LinkedHashMap<Set<ArrayList<Array>>>>>
        for (Map.Entry best: entrySet
             ) {

            System.out.println(best);
        }

    }
}
