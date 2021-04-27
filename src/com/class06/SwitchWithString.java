package com.class06;

import java.util.Scanner;

public class SwitchWithString {
	public static void main(String[] args) {
		
		/*we need to identify favorite food
		 * 
		 * we need to capture country from a user
		 * based on the country identify  favorite food 
		 * 
		 * 
		 */
		
		Scanner input;
		String country, food;
		
		input= new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		
		switch(country.toLowerCase()) {
		case "usa":
			food="burger";
			break;
		case "afghanistan":
			food="Kebab";
			break;
		case "vietnam":
			food="Pho";
			break;
		case "poland":
			food="Pierogi";
			break;
		case "kazakstan":
			food="horse";
			break;
		case "belarus":
			food="draniki";
			break;
		case "tajikistan":
			food="plov";
			break;
		case "mexico":
			food="tacos";
			break;
		default :
			food="unknown";
			
			
		}
		
		System.out.println("Your favorite food is "+food);
		
		
	}
	
	
	
	
	

}
