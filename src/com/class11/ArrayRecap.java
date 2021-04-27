package com.class11;

import java.util.Scanner;

public class ArrayRecap {
	public static void main(String[] args) {
		
		/*
		 * we want to create an array that will store elements from user
		 * 
		 */
		
		 Scanner scan;
		 String [] array;
		 
		 scan=new Scanner(System.in);
		 
		 System.out.println("How many String elements would like to store");
		 int size=scan.nextInt();
		 
		 array=new String [size];
		 
		 for(int i=0; i<size; i++) {
			 System.out.println("Please enter a String");
			 array[i]=scan.next();
			
		 }
		 
		 System.out.println("--------Let's see what have we stired -------");
		 
		 for(String str:array) {
			 System.out.print(str+" ");
		 }
		 
	}
	

}
