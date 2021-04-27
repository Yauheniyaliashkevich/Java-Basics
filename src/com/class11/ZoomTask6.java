package com.class11;

import java.util.Scanner;

public class ZoomTask6 {
	public static void main(String[] args) {
		
		/*
		 * Write a java program to check whether a given number is prime or not?
		 */
		/*int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number"); 
		*/
		System.out.println("-------------------------------------");
		
		int num1=2;
		boolean prime=true;
		
		
		if(num1>1) {
		 for(int i=2; i<num1; i++) {
			
			if (num1%i==0) {
				prime=false;
				break;
			}
		 }
		}else {
			prime=false;
		}
		
		
		
		
		if (prime) {
		    System.out.println(num1+" is a prime numbers");
		}else {
			System.out.println(num1+" is not a prime numbers");
		}
		
	}

}
