package com.class11;

public class ZoomTask5 {
	public static void main(String[] args) {
		
		/*
		 * Write a program to swap 2 numbers without a temporary variable?
		 */
		
		int a=10;
		int b=25;
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------------------------------------------");
		
		a=a+b; //sum
		b=a-b; // first swap
		a=a-b; // second swap
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
