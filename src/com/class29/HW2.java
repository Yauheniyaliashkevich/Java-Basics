package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
    /*

    2/ Create an arrayList of words. Remove every word that ends with “e”.


    */
    public static void main(String[] args) {



        System.out.println("-----------2------------");

        ArrayList <String >arrayList2=new ArrayList<>();
        arrayList2.add("Apple");
        arrayList2.add("Orange");
        arrayList2.add("Banana");

        Iterator<String> iterator=arrayList2.iterator();
        while(iterator.hasNext()){
            String fruit = iterator.next();
            if(fruit.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(arrayList2);

        /*for (int i = 0; i < arrayList2.size(); i++) {
           if(arrayList2.get(i).endsWith("e")){
               arrayList2.remove(arrayList2.get(i));
           }
        }
        System.out.println(arrayList2);
*/



    }
}
