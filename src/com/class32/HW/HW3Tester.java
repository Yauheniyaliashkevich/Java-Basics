package com.class32.HW;

import com.class32.HW.HW3Person;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class HW3Tester {
    public static void main(String[] args) {

        TreeMap<String, HW3Person> mapKV = new TreeMap<>();
        mapKV.put("ID 3456",new HW3Person("Vladik","Savi",28,1500000.0));
        mapKV.put("ID 4366",new HW3Person("Jane","Liashkevich",29,1700000.0));
        mapKV.put("ID 3435",new HW3Person("Vova","Liashkevich",55,1300000.0));
        mapKV.put("ID 6756",new HW3Person("Inna","Liashkevich",55,1300000.0));
        //System.out.println(mapKV);
        Collection <HW3Person> personCollection =mapKV.values();
        for (HW3Person person : personCollection
             ) {
            person.printDetails();
        }
    }
}
