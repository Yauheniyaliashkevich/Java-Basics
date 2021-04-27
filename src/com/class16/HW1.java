package com.class16;

import java.util.Scanner;

public class HW1 {

	/*
	 * Write a program that reads two people's first
       names and if they expecting boy or girl? 
       Based on the input suggests a name for a baby:
       Example Output:
       Mom's first name? Mary
       Dad's first name? Daniel
       Boy or Girl? boy
       Suggested baby name: DANRY
       Example Output:
       Mom's first name? Mary
       Dad's first name? Daniel
       Boy or Girl? girl
       Suggested baby name: MAIEL
	 * 
	 */
	
   public static void main(String[] args) {
	
	   Scanner scan=new Scanner(System.in);
	   
	   String momName;
	   String dadName;
	   String boyOrGirl;
	   String boyName;
	   String girlName;
	   
	   System.out.println("Please enter Mom's first name");
	   momName=scan.nextLine();
	   System.out.println("Please enter Dad's first name");
	   dadName=scan.nextLine();
	   System.out.println("Are you expecting boy of girl");
	   boyOrGirl=scan.nextLine();
	   
	   if(boyOrGirl.equalsIgnoreCase("boy")) {
		    
		   int a= momName.length();   
		   boyName=dadName.substring(0,3) + momName.charAt(a-2) + momName.charAt(a-1);
		   System.out.println(boyName);
	   }else if (boyOrGirl.equalsIgnoreCase("girl")) {
		   int b= dadName.length();
		   girlName=momName.substring(0,3) + dadName.charAt(b-2) + dadName.charAt(b-1);
		   System.out.println(girlName);
	   }else {
		   System.out.println("Invalid who are expecting");
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
  }
}
