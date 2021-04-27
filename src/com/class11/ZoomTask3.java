package com.class11;

public class ZoomTask3 {
	
	public static void main (String[] args) {
		
	
	
	/*
	 * Create a 2D array or integer type where you will store integer values in 3
	 * rows and 4 columns. Develop a program which will calculate the sum of even
	 * and odd numbers for that array.
	 */
		
	int[][] numbers = { { 12, 15, 19, 90 }, { 19, 23, 5, 4 }, { 55, 91, 73, 64 } };
	int sum = 0;
	int odd = 0;
	for (int r = 0; r < numbers.length; r++) {
		for (int a = 0; a < numbers[r].length; a++) {
			if (numbers[r][a] % 2 == 0) {
				sum += numbers[r][a];
			} else {
				odd += numbers[r][a];
			}
		}
	}
	
	System.out.println("The sum of even numbers are "+ sum);
	System.out.println("the sum of odd numbers are "+ odd);
	
}

}















