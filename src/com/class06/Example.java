package com.class06;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		
		/*
		 * we need to calculate final price after the discount 
		 * 
		 * we check if there is sale
		 * if no sale --> I am not going for shopping
		 * if there is sale 
		 *          we will ask the item
		 *          we will ask price
		 * 
		 *          if price is less than 10 --> apply 5% discount
		 *          if price is between 11 and 100 --> apply 10% discount
		 *          if price is between 101 and 500 --> apply 20% discount
		 *          if price is more than 500 --> apply 30% discount
		 *          
		 *         "Which item you purchased, what was original price, what discount and final price" 
		 *          
		 *          
		 */
		
		Scanner scan=new Scanner(System.in);
		boolean sale;
		String item;
		double originalPrice, finalPrice;
		int discount;
		
		System.out.println("Do we have sale today?");
		//boolean sale=scan.nextBoolean();
		
		
		
		if(sale=true) {
			System.out.println("Which item you purchased?");
			item=scan.nextLine();
			       if (item.equalsIgnoreCase("shirt")) { // item= scan.next();
			    	   System.out.println("What was the original price?");
			    	   originalPrice=scan.nextDouble();
			    	             if (originalPrice<10) {
			    	                 discount=5;
			    	             }else if  (originalPrice>=10 && originalPrice<=100) {
			    	            	 discount=10;
			    	             }else if  (originalPrice>=101 && originalPrice<=500) {
			    	            	 discount=20;
			    	             }else if  (originalPrice>500) {
			    	            	 discount=30;
			    	             }else {
			    	            	 discount=0;
			    	             }
			    	   finalPrice=originalPrice-discount;  // Я лох тут!!!        
			    	   System.out.println("Original price of your "+item+" was "+originalPrice+"$, your discount was "+discount+ "%, and your final price is "+finalPrice+".");
			       }else {
			    	   System.out.println("Sorry, we don't have this item");
			       }
			       
		}else {
			System.out.println("I am not going for shopping");
		}
		
		
		
		
		
		
		
		
		
	}

}
