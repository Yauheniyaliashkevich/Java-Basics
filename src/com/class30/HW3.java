package com.class30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HW3 {
    /*
    Create a Set of cities in which you want to make sure
     that insertion order is maintained.
     Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        Set<String> cities=new LinkedHashSet<>();
        cities.add("Chicago");
        cities.add("Alushta");
        cities.add("New York");
        cities.add("Moscow");
        cities.add("Astrakhan");
        cities.add("Pinsk");
        cities.add("Minsk");
        cities.add("Anapa");
        cities.add("Kiev");
        System.out.println(cities);
        cities.removeIf(city -> city.startsWith("A"));
        System.out.println(cities);

        Iterator<String> it=cities.iterator();
        while(it.hasNext()){
            if(it.next().startsWith("A")){
                it.remove();
            }
        }
        System.out.println(cities);

        /*for (String city: cities
             ) {
            if(city.startsWith("A")){
                cities.remove(city);
            }
        }*/




    }
}
