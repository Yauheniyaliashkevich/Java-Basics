package com.class29;

import java.util.ArrayList;

public class HW4 {
    /*
    4/ Create an arrayList of even numbers from 1 to 50.
       Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList4= new ArrayList<>();
        arrayList4.add(10);
        arrayList4.add(20);
        arrayList4.add(14);
        arrayList4.add(20);
        arrayList4.add(46);

       /* for (int i = 0; i < arrayList4.size(); i++) {
            if(arrayList4.get(i)%5==0){
                arrayList4.remove(arrayList4.get(i));
            }
        }
        System.out.println(arrayList4);
        */ //size changing every loop

        for (int  i= arrayList4.size()-1; i>=0 ; i--) {
            if(arrayList4.get(i)%5==0){
                arrayList4.remove(arrayList4.get(i));
            }
        }
        System.out.println(arrayList4);
    }
}
