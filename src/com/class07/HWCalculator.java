package com.class07;

import java.util.Scanner;

public class HWCalculator {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double num1,num2,result;
		char operator;
		
		
		System.out.println("Please enter 2 numbers and operator");
		num1=scan.nextInt();
		num2=scan.nextInt();
		operator=scan.next().charAt(0);
		
		switch(operator) {
		case '+':
			result=num1+num2;
		    break;
		case '-':
			result=num1-num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '%':
			result=num1%num2;
			break;
		default :
			result=0;
			System.out.println("Invalid operator");
			
		}
		
	
		if (result !=0) {
		System.out.println(num1+" "+operator+" "+num2+" is "+result);
		} else {
			System.out.println("Your result is 0");
		}
		
		
		
		
		
		
		
		
	}

}
