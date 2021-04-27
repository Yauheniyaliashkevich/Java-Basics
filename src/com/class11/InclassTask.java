package com.class11;

public class InclassTask {
	public static void main(String[] args) {
		
		/*Create a 2D array where you will store the following values: 
		 * Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
         * After storing values print the following:
         * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan 
		 */
		
		String [][] a= new String [2][4];
		
		a[0][0]="Mr";
		a[0][1]="Mrs";
		a[0][2]="Ms";
		a[0][3]="Miss";
		
		a[1][0]="Smith";
		a[1][1]="Jordan";
		a[1][2]="Jackson";
		a[1][3]="Obama";
		
		System.out.println(a[0][1]+" "+a[1][0]);
		System.out.println(a[0][0]+" "+a[1][3]);
		System.out.println(a[0][2]+" "+a[1][2]);
		System.out.println(a[0][3]+" "+a[1][1]);
	    
		System.out.println("-----------");
		
		/*
         *Create a 2D array that first row will contain 4 names and second row will contain grades.
         *Then your program should print name of the students that has A and B grade 
		 */
		
		
		
		String b [][] = {
				{"Smith", "Jackson", "Obama", "Jordan" },
				{"A","B","C","D","E","F"},
		};
		
		System.out.println(b[0][1]+" "+b[1][0]);
		System.out.println(b[0][3]+" "+b[1][0]);
		System.out.println(b[0][2]+" "+b[1][1]);
	}

}
