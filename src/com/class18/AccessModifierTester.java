package com.class18;

import java.util.Scanner;

public class AccessModifierTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		AccessModifierDemo obj1=new AccessModifierDemo();
		System.out.println(obj1.name); // Public
		//System.out.println(obj1.bankAccountPassword); //Privat
		System.out.println(obj1.SSNNumber); //Default
		
		Scanner scanner= new Scanner(System.in);
		scanner.next();
		
		
	}

}
