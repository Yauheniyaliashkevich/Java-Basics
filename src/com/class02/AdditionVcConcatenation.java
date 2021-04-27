package com.class02;

public class AdditionVcConcatenation {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str2+str2);//21HelloHi
		System.out.println(num1+str1+num2+str2);//10Hello11Hi
		
		System.out.println(str1+str2+num1+num2);//HelloHi1011
		
		String result=str1+str2+(num1+num2);//HelloHi21
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}

}
