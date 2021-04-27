package com.class08;

import java.util.Scanner;

public class InclassTask { 
	public static void main(String[] args) {
		for (int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println("-------------------");
	
		Scanner scan=new Scanner(System.in);
		String answer;
		
		do {
			
		System.out.println("Apply for a credit card");
		answer=scan.nextLine();
		
		     
		     
		} while (!answer.equalsIgnoreCase("Yes"));
		
		System.out.println("Thank you");
		
		System.out.println("-------------------");
		
		
}

}
