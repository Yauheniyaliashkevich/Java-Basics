package com.class32;

import java.util.LinkedList;

public class ProstoReplCheck {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        for(String country:countries){
            if(country.startsWith("A")){
                countries.remove(country);
            }
        }

        System.out.println(countries);
    }
}
