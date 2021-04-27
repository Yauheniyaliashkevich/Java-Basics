package com.class05;

import java.util.Scanner;

public class InclassTask1 {
	public static void main(String[] args) {
		
		Scanner input;
		int height;
		
		input=new Scanner(System.in); 
		
		System.out.println("Please enter your height");
		height=input.nextInt();
		
		if (height<60) {
			System.out.println("You are person who's height short");
		}else if (height>=60  &&  height<=72) {
			System.out.println("You are person who's height medium");
		}else if (height>72) {
			System.out.println("You are person who's height tall");
		}else {
		    System.out.println("Your heigth is invalid");
		}
		
		
		
		
		
		
	}

}
