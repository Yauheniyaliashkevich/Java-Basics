package reviewClass11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraysListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Azizi");
        arrayList.add("Ram");
        arrayList.add("Danilo");
        arrayList.add("Mike");
        System.out.println(arrayList.indexOf("Mike"));
        System.out.println(arrayList.get(arrayList.indexOf("Mike")));

        Map<Integer,String> map= new HashMap<>();
        map.put(123456,"Azizi");
        map.put(123457,"Ram");
        map.put(123458,"Danilo");
        map.put(123459,"Mike");
        map.put(123459,"John");

        /*System.out.println(map);
        System.out.println(map.get(123458));*/
        System.out.println("==========");

        Map<Integer,String> map2= new HashMap<>();
        map2.put(1236,"Vova");
        map2.put(1257,"Dasha");
        map2.put(1458,"Eugene");
        map2.put(1259,"Mj");
        map2.put(1259,"Jane");
        map2.putAll(map);
        System.out.println(map2);
        map2.remove(1259);
        System.out.println(map2);
        System.out.println(map2.get(1257));

    }
}
