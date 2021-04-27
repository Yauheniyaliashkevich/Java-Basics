package com.class07;

import java.util.Scanner;

public class HwUsingIfElse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double num1,num2,result;
		char operator;
		
		
		System.out.println("Please enter 2 numbers and operator");
		num1=scan.nextInt();
		num2=scan.nextInt();
		operator=scan.next().charAt(0);
		
		
		if (operator=='+') {
			result = num1+num2;
		}else if (operator=='-') {
			result = num1-num2;
		}else if (operator=='*') {
			result = num1*num2;
		}else if (operator=='/') {
			result = num1/num2;
		}else {
			result=0;
			System.out.println("Invalid operator");
		}
		
		if(result !=0) {
			System.out.println(num1+" "+operator+" "+num2+" is "+result);
		}
		
		
		
		
	}

}
