package com.class17;

public class LocalVariableDemo {

	
	
	void printInfo(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1="Local";
		
		for(int i=0; i<5;i++) {
			System.out.println(i);
		}
		//System.out.println(name); CE not defined
		
	}

}
