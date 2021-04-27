package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("TestNG");

        Iterator<String> iterator=subjects.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println("-----------------------");

        iterator=subjects.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //System.out.println(iterator.next()); RE
        System.out.println("-----------------------");

        iterator=subjects.iterator();
        while (iterator.hasNext()){
            if(iterator.next().length()>4){
                iterator.remove();
            }
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------");

        iterator=subjects.iterator();
        while (iterator.hasNext()) {
           // System.out.println(iterator.next());
            //System.out.println(iterator.hasNext());
            //System.out.println(iterator.next());

            if (iterator.next().length() > 4) {
                iterator.remove();
            }

        }
        System.out.println("-----------------------");

        iterator=subjects.iterator();
        System.out.println(subjects);
        while (iterator.hasNext()) {
            String var=iterator.next();
            if (var.length() > 4) {
                iterator.remove();
            }
        }
        System.out.println(subjects);

    }
}
