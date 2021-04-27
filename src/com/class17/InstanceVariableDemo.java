package com.class17;

public class InstanceVariableDemo {

	int number=10; //instance variable
	
	void printNumber() {
		System.out.println(number);
		String name="Asghar";
	}
	
	void printNumber2() {
		System.out.println(number);
		//System.out.println(name); CE 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableDemo obj= new InstanceVariableDemo();
		System.out.println(obj.number);
		
		
	}

}
