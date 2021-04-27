package com.class18;

import java.lang.reflect.Array;

public class InclassTask1 {

	/*
	 * Create a method that will accept an array as parameters
	 *  and will return a sum of all elements from that array.
	 *  Method should be visibly only within same package and 
	 *  accessible by the creating an instance of the class
	 */

	
	int  array () {
		int [] array1= {12,3,5};
		int sum=0;
		
		
		for(int i=0;i<array1.length; i++) {
			
			sum+=array1[i];
		}
		
		
		return sum;
	}








}
