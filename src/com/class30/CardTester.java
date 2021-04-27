package com.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTester {
    /*
    Create a Card class that will have implemented  and
     unimplemented methods and a constructor that will initializes
      credit card type.  Create 3 subclasses of a Card card.
      Create 3 objects of different card and store them into LinkedList.
       Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {

        LinkedList<Card> list=new LinkedList<>();
        list.add(new Visa("Visa"));
        list.add(new MasterCard("MasterCard"));
        list.add(new MirCard("MirCard"));


        System.out.println("=========for loop===========");

        for (int i = 0; i < list.size(); i++) {
            list.get(i).method1();
            list.get(i).method2();
        }
        System.out.println("=========advanced for loop===========");

        for (Card card:list
             ) {
            card.method1();
            card.method2();
        }
        System.out.println("=========iterator===========");

        Iterator<Card> iterator=list.iterator();
        while(iterator.hasNext()){
            Card itr=iterator.next();
            itr.method1();
            itr.method2();
        }



    }
}
