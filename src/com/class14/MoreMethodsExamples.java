package com.class14;

import java.lang.reflect.Array;

public class MoreMethodsExamples {

	/* create a method that does not take any values
	 * and always return String Hi
	 * 
	 */
	
	
	String print() {
		return "Hi";
	}
	
	/* create a method that takes a numbers
	 * and  return the double of that number
	 * 
	 */
	
	double doubleTheValue(double input ) {
		return input*2;
	}
	
	/* create a method that will take a 
	 * boolean sa input
	 * if the value is true I want to say take
	 *  the umbrella
	 * and if the value is false I want to 
	 * print please go for a walk
	 */
	
	void isRaining (boolean isRain){
		if (isRain) {
			System.out.println("Please take an umbrella");
		}else {
			System.out.println("Please go for a walk");
		}
	}
	
	/* 
	 * write a method to print batch 9 is great
	 *  5 times
	 */
	
	void batch() {
		for(int i=0; i<5; i++) {
		System.out.println("Batch 9 is a great");
		}
	}
	
	/* create a method that takes 2 numbers as input 
	 * and return the greater number
	 * 
	 */
	
	int num(int num1, int num2) {
		if (num1<num2) {
			return num2; 
		}else {
			return num1;
		}
	}
	
	/* create a method that takes  numbers if 
	 * number
	 * 
	 */
	
	void even(double num1) {
		if (num1%2==0) {
			System.out.println("Number "+num1+" is even");
		}else {
			System.out.println("Number "+num1+" is odd");
		}
	}
	
	
	double  array1 (double []arr) {
		 double sum=0;
		for(int i=0; i<arr.length; i++) {
			 sum+=arr[i];	
		}
		return sum;
	}
	// for (double element:arr) {
	// sum=sum+element;
	// }
	
	//boolean mirror (String word) {
		//if (word.equals("ABC")) {
		//	return true;
		//}else {
		//	return false;
		//}
	//}
	
	boolean isMirror (String str) {
		
		String newStr="";
		for (int i=str.length()-1; i>=0; i-- ) {
			System.out.println(i+" "+str.charAt(i));
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		
		if(str.equals(newStr)) {
			return true;
		}else {
			return false;
		}
			
	}
	
	
	
	
	
	

}
