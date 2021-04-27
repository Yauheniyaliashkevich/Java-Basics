package com.class04;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		
		String creditCard;
		double balance;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
	    creditCard=scan.next();
		
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the cc?");
			   balance=scan.nextDouble(); 
			   if(balance>1000) {
			    	System.out.println("Pay off immediately");
			    	
			    }else {
			    	System.out.println("You can spend more");
			    }
		}else {
			System.out.println("Would you like a credic card?");
		}
		
		
	}

}
