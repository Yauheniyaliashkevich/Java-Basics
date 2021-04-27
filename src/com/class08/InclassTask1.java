package com.class08;

import java.util.Scanner;

public class InclassTask1 {
	public static void main(String[] args) {
		
		String item;
	    int price;
	    int money;
	    int sum=0;
	    int remainder;
	    
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("What do you want to buy?");
	    item=scan.nextLine();
	    System.out.println("What is the price for "+item+"?");
	    price=scan.nextInt();
	    System.out.println("Please pay for "+item);
	    
	    do {
	    	
	        money=scan.nextInt();
	        sum+=money;
	        if(sum<price) {
	        	
	        	remainder=price-sum;
	        	
	            System.out.println("Please give more "+remainder);
	            
	        } else if (sum>price) {
	        	remainder=sum-price;
	        	System.out.println("Here is your change "+remainder);
	        	break;
	        }else {
	        	System.out.println("You got the right amount");
	        }
	        
	        
	        
	    }while(price!=sum) ;
	    	
	    System.out.println("Thank you for shopping!");
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
