package com.class11;

public class ZoomTask7 {
	public static void main(String[] args) {
		
		/*
		 * White a Java Program to print the first 10 numbers 
		 * of Fibonaccii series
		 */
		
		int n1=0;
		int n2=1;
		int n3;
		int i;
		int count=10;
		
		System.out.print(n1+" "+n2);
		
		for(i=2;i<count; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			
		}
		
		System.out.println();
		System.out.println("-----------");
		
		int a=0;
		int b=1;
		int c;
		
		for( int s=1;s<=10; s++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
		
		System.out.println();
		System.out.println("--------");
		
		int f1=0;
		int f2=1;
		
		for ( int f=1; f<=10; f++) {
			System.out.print(f1+" ");
		    f1=f1+f2;
		    f2=f1-f2;
		}
				
		
	}

}
