package reviewClass11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String > cities= new LinkedList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("virginia");
        cities.add("Palm beach");
        cities.add("Chicago");
        cities.add("Casablanca");
        //cities.remove("Chicago");
        System.out.println(cities.getFirst());
        System.out.println(cities.getLast());
        System.out.println("===================iterator========");
        Iterator<String > iterator=cities.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(cities.offer("Chicago"));


    }
}
