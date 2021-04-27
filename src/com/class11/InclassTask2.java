package com.class11;

public class InclassTask2 {
	public static void main(String[] args) {
		
		/*
		 * Create 2D array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 * 
		 * 
		 */
		
		String [][] cars=new String [4][2];
		cars [0][0]="Jeep"; 
		cars [0][1]="Ford";
		cars [1][0]="Audi";
		cars [1][1]="BMW";
		cars [2][0]="Kia";
		cars [2][1]="Hyundai";
		cars [3][0]="Ferrari";
		cars [3][1]="Lamborghini";
		
		for (int r=0; r<cars.length; r++) {
			
			for (int c=0; c<cars[r].length; c++) {
				System.out.print(cars[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------- for each ----------");
		
		for( String [] array:cars) {
			
			for (String elem:array) {
				System.out.print(elem+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		/*
		 * 
		 * Using 2D array create a grocery list.
         * Inside you should have an array of veggies, fruits, dairy and sweets. 
         * Retrieve all values from that array using 2 different loops
		 */
		
		
		System.out.println( "   ---------------------  2 task   ---------------------");
		String [][] grocery= {
				{"Tomato", "Potato", "Pepper", "Celery"},
				{"Apple", "Banana", "Pineapple"},
				{"Milk", "Cheese", "Kefir"},
				{"Candy", "Cake", "Pie", "Chocolate"}
		};		
		
		for( int r=0; r<grocery.length; r++) {
			
			for ( int c=0; c<grocery[r].length; c++) {
				System.out.print(grocery[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------- for each ----------");
		
		for(String [] g:grocery) {
			for(String a:g) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		
	}

}
