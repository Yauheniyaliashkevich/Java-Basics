package Repl;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Repl202 {
    public static void main(String[] args) {

            Map<String, String> map = new TreeMap<>();
            map.put("1 item", "apple");
            map.put("2 item", "banana");
            map.put("3 item", "pear");
            map.put("4 item", "tomato");
            map.put("5 item", "mango");
            map.put("6 item", "kiwi");

            Set<Map.Entry<String, String>> sets = map.entrySet();


            for (Map.Entry<String, String> set : sets) {
                System.out.println("Key is " + sets+ " and values is ");
            }

    }
}
