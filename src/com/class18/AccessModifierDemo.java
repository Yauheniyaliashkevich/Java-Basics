package com.class18;

public class AccessModifierDemo {
	
	public String name;
	private String bankAccountPassword;
	String SSNNumber;
	
	public void park () {
		System.out.println("Every can go to a public park");
	}
	
	void car () {
		System.out.println("My little bro can drive my car");
	}
	private void toothbrush() {
		System.out.println("Only mine");
	}
	
	void printInfo() {
		System.out.println(name);
		System.out.println(bankAccountPassword);
		System.out.println(SSNNumber);
	}
 
}
