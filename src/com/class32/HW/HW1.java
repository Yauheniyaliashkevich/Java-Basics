package com.class32.HW;

import java.util.*;

public class HW1 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */

    public static void main(String[] args) {
        Map<String,String> countriesCities = new TreeMap<>();
        countriesCities.put("Russia","Moscow");
        countriesCities.put("Belarus","Minsk");
        countriesCities.put("Ukraine","Kiev");
        countriesCities.put("USA","Washington");
        countriesCities.put("United Kingdom","London");
        countriesCities.put("France","Paris");
        countriesCities.put("Spain","Madrid");

        Set<String > setCC = countriesCities.keySet();

        System.out.println("===============for each loop for key and value===============");
        for (String cC: setCC
             ) {

            System.out.println(cC+" "+countriesCities.get(cC));
        }

        System.out.println("===============iterator for key and value===============");
        Iterator <String> iterator=setCC.iterator();
        while(iterator.hasNext()){
            String key= iterator.next();
            String value=countriesCities.get(key);
            System.out.println(key+" "+value);
        }


        System.out.println("===============for each loop for value===============");
        for (String value: setCC
             ) {
            System.out.println(value);
        }

        System.out.println("===============iterator for value===============");
        Iterator <String> iterator1=setCC.iterator();
        while(iterator1.hasNext()){
            String value= iterator1.next();
            System.out.println(value);
        }


        Set <Map.Entry<String,String>> entrySet= countriesCities.entrySet();
        System.out.println("===============for each loop for value 2===============");
        for (Map.Entry print: entrySet
             ) {
            System.out.println(print.getValue());
        }

        System.out.println("===============iterator for value 2===============");
        /*Iterator<Map.Entry<String, String>> iterator2=entrySet.iterator();
        while (iterator2.hasNext()){
            Map.Entry key=iterator2.next();
            String value=countriesCities.get(key);
            System.out.println(value);

        }*/

        System.out.println("=========Collection For each loop =========");

        Collection <String > values =countriesCities.values();
        for (String value: values
             ) {
            System.out.println(value);
        }
        System.out.println("=========Collection Iterator=========");
        Iterator <String > iterator3=values.iterator();
        while(iterator3.hasNext()){
            String value= iterator3.next();
            System.out.println(value);
        }



    }
}
