package com.class19;

public class ConstructorsDemo2 {
	
	double bonus;
	double salary;
	String name;
	
	ConstructorsDemo2 (String name){
		bonus=50000;
		salary=50000;
		this.name=name;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorsDemo2 obj=new ConstructorsDemo2("Ram");
		System.out.println(obj.bonus);
		System.out.println(obj.salary);
		System.out.println(obj.name);
	}

}
