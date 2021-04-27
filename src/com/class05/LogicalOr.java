package com.class05;

public class LogicalOr {
	public static void main(String[] args) {
		
		/* variable day
		 * if day is Tuesday or Wednesday --> Manual class
		 * if day is Monday or Friday --> no class
		 * is day is Saturday or Sunday --> Java class
		 * if day is Thursday --> review class											
		 */
		
		String day="Saturday";
		
		if (day.equals("Monday")  ||    day.equals("Friday")){
			System.out.println("Today I have no class");	
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today I have Manual class");
		}else if (day.equals("Thursday")) {
			System.out.println("Today I have a review class");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today I have a Java class");
		}else {
			System.out.println(day+" is invalid");
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}
