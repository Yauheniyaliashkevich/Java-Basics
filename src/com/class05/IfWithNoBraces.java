package com.class05;

public class IfWithNoBraces {
	public static void main(String[] args) {

		String day = "Saturday";
		
		System.out.println("------- If without braces --------");
		
		if (day.equals("Friday"))
			System.out.println("Today is my movie day");
			System.out.println("Tomorrow I have a class at Syntax");

		System.out.println("------- If with braces --------");
		
		if (day.equals("Friday")) {
			System.out.println("Today is my movie day");
			System.out.println("Tomorrow I have a class at Syntax");
		}
		System.out.println("------- End of program --------");
		
		int num = 10;

		if (num > 10)
		   System.out.println("Number is larger than 10");
		   
		
		else //if no braces java identifies only 1 statement per block (if block or else block
		   System.out.println("Number is less than 10");
		   System.out.println("Second statement inside else block");
	}

}
