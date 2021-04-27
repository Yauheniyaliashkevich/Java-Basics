package com.class04;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		
		//String city="Chicago";
		//int temF=80;
		//int temC=(temF-30)*2;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What city do you live?");
		
		String city=scan.nextLine();
		
		System.out.println("What is the temperature today?");
		
		int temF=scan.nextInt();
		
		int temC=(temF-30)/2;
		
		System.out.println("The temperature in the city "+city+" is "+temC);
		
		
	}

}
