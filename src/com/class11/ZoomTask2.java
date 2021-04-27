package com.class11;

public class ZoomTask2 {
	public static void main(String[] args) {
		
		/* Create a 2D array or integer type where you will store odd 
		 * and even numbers in 3 rows and 4 columns. 
		 * Develop a program which will identify/print the 
		 * even numbers only.
		 * 
		 * 
		 */
		
		int [] [] numbers= {
				{5,6,7,8},
				{23,45,66,84},
				{102,345,543,678}
		};
		
		for ( int r=0; r<numbers.length; r++) {
			
			for (int c=0; c<numbers[r].length; c++) {
				
				if ( numbers[r] [c]%2==0  ) {
					System.out.print(numbers [r][c]+" ");
					
				}
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
