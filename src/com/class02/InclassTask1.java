package com.class02;

public class InclassTask1 {

	public static void main(String[] args) {
		
		int n1=99;
		int n2=88;
		
		int sum=n1+n2;
	    int sub=n1-n2;
		int mult=n1*n2;
		double div=n1/n2;
		
		String subOf="subtract";
		String multOf="multiply";
		String divOf="divide";
		
		
		System.out.println("The sum of 2 numbers "+n1+" and "+n2+" is equal to "+sum);
		System.out.println("The "+subOf+" of 2 numbers "+n1+" and "+n2+" is equal to "+sub);
		System.out.println("The "+multOf+" of 2 numbers "+n1+" and "+n2+" is equal to "+mult);
		System.out.println("The "+divOf+" of 2 numbers "+n1+" and "+n2+" is equal to "+div);

	}

}
