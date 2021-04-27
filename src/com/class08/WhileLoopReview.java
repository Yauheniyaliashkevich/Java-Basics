package com.class08;

import java.util.Scanner;

public class WhileLoopReview {
	public static void main(String[] args) {
		
		/* we need to make user to pay for soda
		 * keep asking user to pay you until it enters 3
		 * 
		 * if user gives more than 3 --> please give less money
		 * if user gives less than  3 --> please give more money
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		int money=0;
		
		System.out.println("Please give me money");
		money=scan.nextInt();
		
		while (money!=3) {
			  
			
			  if (money>3) {
			  System.out.println("Please give less money");
			  }else if(money<3) {
		      System.out.println("Please give more money");
			  }
			  
			  money=scan.nextInt();
		}
		
		System.out.println("Thank you");
		
		
		System.out.println("-------------------- do -------");
		
		do {
			System.out.println("Please give me money");
			money=scan.nextInt();
			  if (money>3) {
			  System.out.println("Please give less money");
			  }else if(money<3) {
		      System.out.println("Please give more money");
			  }
			
			
		}while (money!=3) ;
			System.out.println("Thank you");
		
		
		
		
		
		
	}

}
