package com.class17;

public class Employee {
	
	String eID;
	Double salary;
	static String ceo="Sumair";
	
	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.eID="FH343";
		obj1.salary=123000.0;
		
		
		Employee obj2=new Employee();
		obj2.eID="FK943";
		obj2.salary=150000.0;
		
		System.out.println(obj1.eID+" has salary= "+obj1.salary+" and CEO "+ceo);
		System.out.println(obj2.eID+" has salary= "+obj2.salary+" and CEO "+ceo);
		
	}

}
