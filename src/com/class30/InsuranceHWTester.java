package com.class30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class InsuranceHWTester {
    /*
   Create a class Insurance that will have an attribute as insuranceName
   and unimplemented behaviour as getQuote and cancelInsurance.
   Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute
    as carModel and Class Pet has petType attribute. Create 3 objects of
    the sub classes and store them in ArrayList. Using for loop/advanced
    for loop/ iterator access all methods of the class.
    */
    public static void main(String[] args) {
ArrayList<InsuranceHW1> insurance=new ArrayList<>();
insurance.add(new Car("StateFarm","Jeep"));
insurance.add(new Pet("Cigna","Cat"));
insurance.add(new Health("BluePrint"));

        System.out.println("==========for loop==========");
        for (int i = 0; i < insurance.size(); i++) {
            insurance.get(i).getQuote();
            insurance.get(i).cancelInsurance();

        }
        System.out.println("==========advanced for loop==========");
        for (InsuranceHW1 ins: insurance
             ) {
            ins.getQuote();
            ins.cancelInsurance();
        }



        System.out.println("==========Iterator==========");
Iterator<InsuranceHW1> iterator=insurance.iterator();

while (iterator.hasNext()){
    InsuranceHW1 ins=iterator.next();
    ins.getQuote();
    ins.cancelInsurance();

}


    }
}
