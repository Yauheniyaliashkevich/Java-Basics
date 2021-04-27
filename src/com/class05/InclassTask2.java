package com.class05;

import java.util.Scanner;

public class InclassTask2 {
	public static void main(String[] args) {
		
		Scanner input;
		int day;
		
		input=new Scanner(System.in);		
		
		System.out.println("Please enter what is a day today");
		day=input.nextInt();
		
		if(day>=1  && day <=5) {
			System.out.println("Today is a weekday");
		}else if( day>=6  && day<=7) {
			System.out.println("Today is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		
		
	}

}
