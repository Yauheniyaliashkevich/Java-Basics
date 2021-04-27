package com.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=7;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);// != not equal 
		
		//the result ALWAYS will be BOOLEAN
		
		System.out.println("-------------");
		boolean result=a>=b;//yes --> true
		boolean result1=a<=b;//no -->false
		System.out.println(result);
		System.out.println(result1);
		
		System.out.println("-------------");
		int c=20;
		int d=29;
		
		System.out.println(c==d);// checking equality //false
		System.out.println(c=d);//assigning the value (c to d) //29
		System.out.println(c);
		System.out.println(d);
		
		
		
	}

}
