package Repl;

import java.util.ArrayList;

public class Repl187 {
    public static void main(String[] args) {


            ArrayList<String> arr=new ArrayList<>();
            arr.add("0");
            arr.add("1");
            arr.add("2");
            arr.add("3");
            arr.add("4");
            arr.add("5");
            arr.add("6");
            arr.add("7");
            arr.add("8");
            arr.add("9");
            arr.add("10");
            arr.add("11");
            arr.add("12");
            arr.add("13");
            arr.add("14");
            arr.add("15");


            for(Integer i=0;i<arr.size(); i++){
                if(arr.indexOf(i)%2!=0){
                    arr.remove(arr.get(i));
                }
            }

            String str="";
            for(String s:arr){
                str+=s+" ";
            }
            System.out.println(str+" ");








        }
}
