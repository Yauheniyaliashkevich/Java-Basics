package com.class07;

public class HW {
	public static void main(String[] args) {
		
		/*
		 *  calculate sum of odd and even numbers from 1 to 50 
		 */
		
		int sum=0;
		for (int i=1; i <=50; i++ ) {
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("------------1 ---------------");
		
		int sumEven=0;
		
		for (int i = 0; i <=50; i+=2) {
			sumEven+=i;
		}
		System.out.println("Sum of even numbers is "+sumEven);
		
		
		int sumOdd=0;
		
		for (int i=1; i<=50; i+=2) {
			sumOdd+=i;
		}
		System.out.println("Sum of odd numbers is "+sumOdd);
		
		System.out.println("----------- preferrable way 2 -----------");
		
		int odd=0;
		int even=0;
		
		for (int i=1; i<=50; i++) {
			if (i%2==0) {
				even=even+i;
			}else {
				odd+=i;
			}
		}	
		
		System.out.println("Sum of odd numbers equal to "+odd);
		System.out.println("Sum of even numbers equals to "+even);
		
	}

}
