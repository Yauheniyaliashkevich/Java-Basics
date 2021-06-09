package Repl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repl208 {


    public static void display( Map<String, Integer> mapp) {
        if (!mapp.isEmpty()) {
            Set<Map.Entry<String, Integer>> sets=mapp.entrySet();
            /*for (int i = 0; i < mapp.size(); i++) {
                System.out.println(mapp.get(i));

            }*/
            for (Map.Entry<String, Integer> set : sets) {
                System.out.println(set.getKey() + " " + set.getValue());
            }
        } else {
            System.out.println("map is empty");

        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        display(map);

    }
}
