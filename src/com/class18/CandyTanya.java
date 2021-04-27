package com.class18;

import java.util.Scanner;

public class CandyTanya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candy,rem,gum, numberOfCoupons;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter numbers of the coupons you win");
		numberOfCoupons=scan.nextInt();
		
		if(numberOfCoupons>2) {
			candy=numberOfCoupons/10;
			rem=numberOfCoupons%10;
			gum=rem/3;
			System.out.println("Number of candies: "+candy);
			System.out.println("Number of gumballs: "+gum);
			
		}else {
			System.out.println("Not enough coupons");
		}
	}

}
