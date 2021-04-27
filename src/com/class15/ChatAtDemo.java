package com.class15;

public class ChatAtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Roheen";
		int sum=0;
		System.out.println(name.charAt(0));
		for (int i=0; i<name.length(); i++) {
			
			if (name.charAt(i)=='e') {
			System.out.println("e found");
			}
			
			if (name.charAt(i)=='e') {
				sum++;
				}
		}
        System.out.println(sum+" es are found");
	}

}
