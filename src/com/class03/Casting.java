package com.class03;

public class Casting {
	public static void main(String[] args) {
		
		//int i=10.99; //type mismatch 
		
		//widening or implicit casting
		double d=10;
		System.out.println(d);
		
		int num=10;
		
		//narrowing or explicit casting
		int i=(int)12.99;
		System.out.println(i);
		
		byte b=(byte)130;
		System.out.println(b );//-126
		
		int cakePiece=11; //double =2.75
	    cakePiece/=4;
	    System.out.println(cakePiece);//2
	    
		int number=12;
		double result=number/5; //int/int
		System.out.println(result);//2.0
		
		//for division ALWAYS use DOUBLE!!!!!
		
		double newNum=10;
		newNum=newNum/3;
		System.out.println(newNum);//3.33333
		
		//int num1=10+10.5;error
		
		double num1=10+10.5;
		System.out.println(num1);//20.5
		
		
		
		
		
		
	}

}
