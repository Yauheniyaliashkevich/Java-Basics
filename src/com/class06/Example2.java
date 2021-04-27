package com.class06;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		
		double price, discount =0, finalPrice;
		String item;
		
		Scanner scan = new Scanner(System.in);  
		System.out.println("Do we have sale today?");
		
		boolean sale = scan.nextBoolean();
		
		if(!sale) {
			
			System.out.println("I am not going for shopping");
			
		}else {
			System.out.println("What item do you have?");
			item=scan.next();
			System.out.println("What's the price of that item?");
			price=scan.nextDouble();
			
			if(price>0 && price<10) {
				discount=price*0.05;
				
			} else if (price>=10 && price<100) {
				discount=price*0.1;
				
			} else if (price>=100 && price<500) {
				discount=price*0.2;
				
			} else if (price>500) {
				discount=price*0.3;
				
			}
			
			finalPrice=price-discount;
			System.out.println("You are buying "+item+" with original price ="+price+" after discount "+discount+" your final price is =$"+finalPrice);
			
			if (finalPrice<500) {
				System.out.println("I did not do crazy shopping");
			}else {
				System.out.println("I spent all my money");
			}
			
		}
		
		        
	}

}
