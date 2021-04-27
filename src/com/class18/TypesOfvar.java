package com.class18;

public class TypesOfvar {
	
	
	String name;
	static String CompanyName="Syntax";
	
	void printInfo() {
		System.out.println(name+" Conpany "+CompanyName);
	}
	
	static void printCompanyInfo() {
		//System.out.println(Name); CE 
		System.out.println(CompanyName);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypesOfvar obj1=new TypesOfvar();
		obj1.name="Ram";
		
		TypesOfvar obj2=new TypesOfvar();
		obj2.name="Aiman";
		
		TypesOfvar.printCompanyInfo();

	}

}
