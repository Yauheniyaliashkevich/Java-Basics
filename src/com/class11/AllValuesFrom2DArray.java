package com.class11;

public class AllValuesFrom2DArray {
	public static void main(String[] args) {
		
		
		String[][] usa= {
				{"Alexandria","Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Philly", "Strassburg", "Pittsburgh"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach", "San Francisco", "Sacramento", "Santa Barbara"},
				{"Miami", "Orlando", "Tampa", "Tallahasee"}
				
		};
		
		System.out.println(usa.length); // 5 total single arrays / 5 rows total
		System.out.println(usa[0].length); // 5 elements inside 1 array/ 5 columns in 1 ray
		System.out.println(usa[1].length); // 3 elements inside 2 array/ 3 columns in 2 ray
		System.out.println(usa[2].length); // 4 elements inside 3 array/ 4 columns in 3 ray
		
		
		for( int r=0; r<usa.length; r++) { //iterates over rows
			
			for (int c=0; c<usa[r].length; c++) {
				System.out.print(usa[r][c]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("------- using nested for each loop ----");
		
		for(String [] cities:usa) {
			for (String city :cities) {
				System.out.print(city+" ");
			}
			System.out.println();
		}
		
		
		
	}
	

}
