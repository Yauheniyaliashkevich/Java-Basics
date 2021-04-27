package reviewClass11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<String> cities= new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("virginia");
        cities.add("Palm beach");
        cities.add("Chicago");
        cities.add("Casablanca");
        int index=cities.indexOf("virginia");
        cities.add(index,"Newyork");
        cities.add(0,"Alexandria");
        cities.add(0,"Lahore");

        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.indexOf("Chicago"));
        System.out.println(cities.isEmpty());
        System.out.println(cities.lastIndexOf("Chicago"));
        System.out.println(cities.set(0,"Chicago"));
        System.out.println(cities);
        System.out.println(cities.remove("Chicago"));
        System.out.println(cities);
        System.out.println(cities.remove("svvvd"));
        System.out.println(cities.remove(1));
        //System.out.println(cities.remove(111)); //RE IndexOutOfBoundsException
        int firstIndex= 2;
        int lastIndex=3;
        System.out.println("==========sublist==========");
        System.out.println(cities.subList(firstIndex,lastIndex));
        //ArrayList<String > limitedCities = (ArrayList<String>) cities.subList(firstIndex,lastIndex);
        ArrayList<String > limitedCities = new ArrayList<>(cities.subList(firstIndex,lastIndex)) ;
        List <String > limitedCities1=cities.subList(firstIndex,lastIndex);
        System.out.println(limitedCities);
        System.out.println(limitedCities1);

    }
}
