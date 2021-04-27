package com.class16;

public class InClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a String that will hold a sentence.
		 *  Write a program to get a new String without any spaces.
		 */
		String sen="Jane you are so beautiful";
		System.out.println(sen.replace(" ", ""));
	
	
	/*
	 * Create a String that should be combination of letters,
	 *  numbers and special characters.
	 *   Find out how many alpha characters are there in the String.
	 */
	
	String var1="khjfdshJKHDAJKSH23%$2%3^±!";
	
	System.out.println(var1.replaceAll("[^a-zA-Z]","").length());
	
	
	/*
	 * You have a String a="Is it saturday? 
	 * Is it raining? Do we have a Java Class today?
	 * " How would you find out how many sentences are in that String?
	 */
	
	String a="Is it saturday?Is it raining? Do we have a Java Class today?";
	String [] arr=a.split("[?]");
	int count=0;
	for(String b:arr) {
		System.out.println(b);
		count++;
	}
	
	System.out.println(count);
	
	}
	
	
	
}
