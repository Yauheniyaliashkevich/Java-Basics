package Repl;

import java.util.*;

public class Repl209 {
    public static void main(String[] args) {
        List<Map<String,Object>> dataList=new LinkedList<>();
        Map<String,Object> appleMap=new LinkedHashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10.0);
        dataList.add(appleMap);

        Map<String,Object> orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10.0);
        dataList.add(orangeMap);

        String str="";
        String str2="";
        Double subTotal =0.0;
        Double totalPurchase=0.0;

        for(Map<String,Object> map:dataList){
            for(Map.Entry<String,Object> set:map.entrySet()){
                str=set.getKey();
                str2=set.getValue().toString();
                System.out.print(str+": "+str2+" ");
                if(str.equals("Items")){
                    continue;
                }else{
                    if(subTotal==0.0) {
                        subTotal = (Double.parseDouble(str2));
                    }else {
                        subTotal*=(Double.parseDouble(str2));
                    }
                }
            }
            System.out.println("SubTotal: "+subTotal);
            System.out.println();
            totalPurchase+=subTotal;
            subTotal=0.0;
        }
        System.out.println("Your Purchase total : "+ totalPurchase);


    }
}
