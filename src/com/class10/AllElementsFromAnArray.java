package com.class10;

public class AllElementsFromAnArray {
	public static void main(String[] args) {
		
		int [] numbers= {10,11,14,78,5,90};
		
		for(int i=0; i<numbers.length; i++) {
			
			   if (numbers[i]%2==0) {
			
			System.out.print(numbers[i]+" ");
		
			   }
		}
		System.out.println();
		System.out.println("--------print to reverse ----------");
		//print to reserve
		
		for(int i=numbers.length-1; i>=0; i--) {
			
			System.out.print(numbers[i]+" ");
		}
		
	}

}
