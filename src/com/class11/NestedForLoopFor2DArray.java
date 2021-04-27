package com.class11;

public class NestedForLoopFor2DArray {
	public static void main(String[] args) {
		
		int [][] numbers= {
				{10,20,30,40},
				{90,80},
				{1,2,3,4,5,6,7}
		};
		
		System.out.println(numbers.length); // total numbers of single arrays
		System.out.println(numbers[1].length);
		
		
		
		for( int row=0; row<numbers.length; row++) {
			for(int col=0; col<numbers[row].length; col++) {
				
				System.out.print(numbers[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		for (int [] array:numbers) {
			
			for(int a:array) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
	}

}
