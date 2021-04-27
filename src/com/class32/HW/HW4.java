package com.class32.HW;

import com.sun.media.sound.SF2InstrumentRegion;

import java.util.*;

public class HW4 {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
John Smith=$100000
     */
    public static void main(String[] args) {
        Map <String,Double> emp= new HashMap<>();
        emp.put("Jane",270000.0);
        emp.put("Dasha",200000.0);
        emp.put("Vova",150000.0);
        emp.put("Inna",151000.0);
        emp.put("Vlad",270000.0);
        emp.put("John",180000.0);
        emp.put("Ula",130000.0);

        System.out.println("============== Collection// value() ==========");
        Collection<Double> value= emp.values();
        Iterator <Double> iterator = value.iterator();

        Double max=0.0;
        while(iterator.hasNext()){
            Double val=iterator.next();

            if(val>max){
                max=val;
            }else{
                iterator.remove();
            }
        }
        System.out.println(emp);

        System.out.println("============== Entry ==========");

        Set<Map.Entry<String,Double>> map1= emp.entrySet();
        //LinkedList <Map.Entry<String,Double>> list = new LinkedList<>(map1);
        Double max1=0.0;
        for (Map.Entry<String,Double> val:map1
             ) {
            if(max1<val.getValue()){
                max1=val.getValue();
            }
            System.out.println(val.getKey()+"=$"+val.getValue());
        }

        System.out.println("========== with Asghar //keySet() =========");
        Set <String > empKeys=emp.keySet();

        Double maxSalary =Double.MIN_VALUE; //=0;
        String maxSalaryKey="";

        for (String key:empKeys
             ) {
            if(emp.get(key)>maxSalary){
                maxSalary=emp.get(key);
                maxSalaryKey=key;
            }
        }
        System.out.println(maxSalaryKey+" earns the Max salary "+emp.get(maxSalaryKey));

    }


}
