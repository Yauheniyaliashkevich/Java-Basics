package com.class18;

import java.util.Scanner;

public class Repl {
	public static void main(String[] args) {
		
	
	
	String item1, item2, item3, report;
	double price1, price2, price3, totalPrice;
	int count1, count2, count3;
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter Item1, count and it's price");
	item1=scan.next();
	count1=scan.nextInt();
	price1=scan.nextDouble();
	
	System.out.println("Enter Item2, count and it's price");
	item2=scan.next();
	count2=scan.nextInt();
	price2=scan.nextDouble();
	
	System.out.println("Enter Item3, count and it's price");
	item3=scan.next();
	count3=scan.nextInt();
	price3=scan.nextDouble();
	
	
	
	if (count1!=0 && count2!=0 && count3!=0) {
		report=item1+" price: "+price1*count1+", "+item2+" price: "+price2*count2+", " +item3+" price: "+price3*count3;
		System.out.println(report);
		totalPrice=price1*count1+price2*count2+price3*count3;
		System.out.println("Total price: "+totalPrice);
		
	}else if(count1!=0 && count2!=0) {
		report=item1+" price: "+price1*count1+", "+item2+" price: "+price2*count2;
		System.out.println(report);
		totalPrice=price1*count1+price2*count2;
		System.out.println("Total price: "+totalPrice);
		
	}else if(count1!=0 && count3!=0) {
		report=item1+" price: "+price1*count1+", "+item3+" price: "+price3*count3;
		System.out.println(report);
		totalPrice=price1*count1+price3*count3;
		System.out.println("Total price: "+totalPrice);
		
	}else if (count2!=0 && count3!=0) {
		report=item2+" price: "+price2*count2+", " +item3+" price: "+price3*count3;
		System.out.println(report);
		totalPrice=price2*count2+price3*count3;
		System.out.println("Total price: "+totalPrice);
		
	}else if (count1!=0 ) {
		report=item1+" price: "+price1*count1;
		System.out.println(report);
		totalPrice=price1*count1;
		System.out.println("Total price: "+totalPrice);
		
	}else if (count2!=0 ) {
		report=item2+" price: "+price2*count2;
		System.out.println(report);
		totalPrice=price2*count2;
		System.out.println("Total price: "+totalPrice);
		
	}else if (count3!=0 ) {
		
		System.out.println(report=item3+" price: "+price3*count3);
		totalPrice=price3*count3;
		System.out.println("Total price: "+totalPrice);
		
	}
	
	
	
	
	
	
	
	
	}
}
