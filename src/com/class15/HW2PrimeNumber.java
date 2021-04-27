package com.class15;

import java.util.Scanner;

public class HW2PrimeNumber {
	/*
	 * Write a method to return whether given number is prime or not?
	 * 
	 * 
	 */
	
	public static void primeNumber(int a) {
		boolean prime=true;
		
		for(int i=2; i<a; i++) {
		  if(a>1) {
			if(a%2==0) {
				prime=false;
				break;
			}
			
		  }else {
			prime=false;
		  }
		 
		}
		
		if(prime) {
		 System.out.println(a+" is prime number");
		}else {
			System.out.println(a+ " is not prime number");
		}
	}
	
	
	public static void main(String[] args) {
		
		HW2PrimeNumber obj=new HW2PrimeNumber ();
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter number");
		int num=scan.nextInt();
		obj.primeNumber(num);
		
		
	}

}
