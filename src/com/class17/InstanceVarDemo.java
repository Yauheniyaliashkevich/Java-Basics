package com.class17;

public class InstanceVarDemo {
	
	static String name="Jane";
	int age=10;
	
	void pringInfo() {
		//if I am inside the same class and my method is not static
		// I can use my instance variable diractly
		double salary=120000;
		System.out.println(name+" "+age);
	}

}
