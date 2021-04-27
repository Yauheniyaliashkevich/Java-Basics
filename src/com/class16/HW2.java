package com.class16;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a String and if the String is not empty perform the following: 
           if the String has an odd number of characters and has 3 or more characters, 
           print the character in the middle of the String.
           
		 */
	Scanner scan=new Scanner(System.in);
	 String str;
	
	 System.out.println("Please enter the String");
	str=scan.nextLine();
	
	if( !str.isEmpty()) {
		if(str.length()%2!=0 && str.length()>=3) {
			System.out.println(str.charAt(str.length()/2));
			
		}else {
			System.out.println("The string has an even number of characters");
		}
	} else {
		System.out.println("The String is empty");
	}
	
	
	
	
	
	}

}
