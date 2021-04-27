package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		
		/*
		 * to donate:
		 * you must be 18 and older, otherwise you cannot
		 * your weight must be more than 110 lbs, otherwise you cannot donate
		 * 
		 */
		
		int age=18;
		int weight=110;
		
		if(age>=18) {
			//System.out.println("You can donate");
			if (weight>110) {
				System.out.println("You can donate based on your age and weight");
			}else {
				System.out.println("You cannot donate");
			}
			
		}else {
			System.out.println("You cannot donate");
		}
		
		
		
		
		
		
	}
	
	
}
