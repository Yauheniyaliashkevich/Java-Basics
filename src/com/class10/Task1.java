package com.class10;

public class Task1 {
   public static void main(String[] args) {
	
	   /*
	    * Create an array of names and store all names of your group. 
	    * Then print your name from that array. (use 2 different ways of creating an array)
	    * 
	    * 
	    */
	   
	   
	   String[] name=new String [5];
	   name[0]="Vlad";
	   name[1]="Jane";
	   name[2]="Alex";
	   name[3]="Inna";
	   name[4]="Vova";
	   
	   System.out.println("My name is "+name[1]);
	   
	   System.out.println("--------");
	   
	   String [] names= {"Vlad", "Jane","Vova", "Inna"};
	   
	   System.out.println("His name is "+names[0]);
	   
	   
	   
	   
	    /*
	     * Create an array of words: Java, Saturday, day, coding, is.
	     *  Print the following sentence using elements of array: “Saturday is Java coding Day”.
	     * 
	     * 
	     * 
	     */
	   
	   
	   String [] array=new String [5];
	   array [0]="Java ";
	   array [1]="Saturday ";
       array [2]="Day";
       array [3]="coding ";
       array [4]="is ";
       
       System.out.println(array[1]+array[4]+array[0]+array[3]+array[2]);
	   
	   String[] array1= {"Java ","Saturday ","Day","coding ","is "};
	   
	   System.out.println(array1[1]+array1[4]+array1[0]+array1[3]+array1[2]);
	   
	   
	   System.out.println("-------------------");
	   //how to ger all elements from an array
	   
	   String [] name2 = {"Grey","Ali","Jose","Alec","Aman","Ozoda","Angelo","Karina","Anastasia","Alina"};
	   
	   for (int i=0; i<name2.length; i++) {
		   System.out.println(name2[i]);
	   }
		   
	   System.out.println("--------------");
	   
	   
	   
}
}
