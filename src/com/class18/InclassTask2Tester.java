package com.class18;

public class InclassTask2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InclassTask2 obj=new InclassTask2();
	 
		StringBuilder sb=new StringBuilder(obj.word("Jane"));
		sb.reverse();
		
		System.out.println(sb);
		
	}

}
