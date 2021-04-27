package com.class08;

import java.util.Scanner;

public class InclassTask2 {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		int start;
		int end;
		int sumEven=0;
		int sumOdd=0;
		
		System.out.println("Please enter the number of start");
		start=scan.nextInt();
		System.out.println("Please enter the number of end");
		end=scan.nextInt();
		
		
		
		
		
		if (start<end) {
			
		     for (int a=start; a<end; a++) {
			
			      if (a%2!=0) {
			    	  sumOdd+=a;
			      }else {
			    	  sumEven+=a;
			      }
		     }
		   
	    }else if (start>end ) {
	    	
			  for (int a=end; a<start; a++) {
				
			      if (a%2!=0) {
			    	  sumOdd+=a;
			      }else {
			    	  sumEven+=a;
			      }
			      
			 }
	    }else {
			System.out.println("Equals numbers");
	   }	
		   
		System.out.println("The sum of the even numbers is "+sumEven);
		System.out.println("The sum of the odd numbers is "+sumOdd);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
