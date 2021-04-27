package com.class02;

public class Variables {

	public static void main(String[] args) {
		String name="Yauheniya";
		String lastName="Liashkevich";
		char grade='A';
		String city="Chicago";
		String state="Illinois";
		String phoneNumber="516-495-28-44";
		
		String fullName= name+" "+ lastName;
		
		System.out.println("My name is "+fullName+".");
		System.out.println("I am "+grade+" student.");
		System.out.println("I live in "+city+", "+state+".");
		System.out.println("And my phone number is "+phoneNumber+".");
		
		
		String newCity="Boca Raton";
		String newPhoneNumber="516-123-45-67";
		
		System.out.println("Now I have to move to "+newCity+".");
		System.out.println("And my new phone number is "+newPhoneNumber+".");
		
		
		//Какой то придурок напечатал что-то
		
		System.out.println(city.length());
		System.out.println(city+"\n"+state+"\t"+phoneNumber);

		
		
		
		
		
	}

}
