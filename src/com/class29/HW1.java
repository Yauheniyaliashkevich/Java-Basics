package com.class29;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {
        /*
        1/ Create an arraylist of cars and retrieve
         all the values using 3 different ways.
         */
        System.out.println("-----------1------------");
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("BMW");
        arrayList1.add("Jeep");
        arrayList1.add("Toyota");
       /* arrayList1.remove("Jeep");
        arrayList1.remove(0);
        arrayList1.clear();*/
        System.out.println(arrayList1);

        for (String element :arrayList1){
            System.out.print(element+" ");
        }
        System.out.println();

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i)+" ");
        }
    }
}
