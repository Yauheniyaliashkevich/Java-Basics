package com.class29;

import java.util.ArrayList;

public class HW3 {
    public static void main(String[] args) {
        /*
        3/ Create an arrayList of drinks.
        If any drink has letter “a” or “e” replace it with water.
         */
        System.out.println("-----------3------------");
        ArrayList<String> arrayList3=new ArrayList<>();
        arrayList3.add("Vodka");
        arrayList3.add("Tea");
        arrayList3.add("Coffee");
        arrayList3.add("Liquor");

        for (String drink:arrayList3
        ) {
            if( drink.contains("a")||drink.contains("e")){
                arrayList3.set(drink.indexOf(drink),"Water");
                //drink.replace(drink,"Water");
            }
        }

        for (int i = 0; i < arrayList3.size(); i++) {
            if(arrayList3.get(i).contains("e")||arrayList3.get(i).contains("a")){
                arrayList3.set(i,"Water");
            }
        }
        System.out.println(arrayList3);
    }
}
