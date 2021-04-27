package com.class05;

import java.util.Scanner;

public class Task1BetterWay {
	public static void main(String[] args) {
		
		Scanner input;
		int height;
		
		input=new Scanner(System.in); 
		
		System.out.println("Please enter your height");
		height=input.nextInt();
		
		String definition;
		if (height<60) {
			
			definition="short";
			
		}else if (height>=60  &&  height<=72) {
			
			definition="medium";
			
		}else  {
			
			definition="tall";
		}
		
		System.out.println("You are person who's height "+definition);
		
		
		
		
		
		
	}

}
