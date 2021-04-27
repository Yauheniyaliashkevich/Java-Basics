package reviewClass11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<String> cities= new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("virginia");
        cities.add("Palm beach");
        cities.add("Chicago");
        cities.add("Casablanca");
        if(cities.subList(0,1) instanceof ArrayList){
            System.out.println("Possible ");
            ArrayList<String > limitedCities = new ArrayList<>(cities.subList(0,1));
        }else{
            System.out.println("Not a child");
        }
        //ArrayList<String > limitedCities = new ArrayList<>(cities.subList(0,1)) ; //Class cast error
        ArrayList<String> limitedCities=new ArrayList<>();
        System.out.println(limitedCities.getClass());
        System.out.println(cities.subList(0,1).getClass()); //different Object

    }
}
