package com.class32.HW;

import Repl.A;

import java.util.ArrayList;

public class HW6 {
    /*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
     */
    public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(10);
        number.add(15);

        Integer sum=0;

        for (Integer num:number
             ) {
            sum+=num;
        }
        System.out.println(sum);





    }
}
