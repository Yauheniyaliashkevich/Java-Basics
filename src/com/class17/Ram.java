package com.class17;

public class Ram {
	public static void main(String[] args) {
		
	
	int salary = 100300005;
	StringBuilder sb=new StringBuilder(String.valueOf(salary)); //converting a int to a String and String to StringBuilder
	sb.reverse();
	
	salary= Integer.parseInt(sb.toString()); // converting back to int
	System.out.println(salary);
	
	}
}
