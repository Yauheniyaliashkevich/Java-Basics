package com.class19;

public class ConstructorsDemo3 {
	
	String name;
	double salary;
	double bonus;
	int numbersOfDaysWorked;
	double bonusPercentage;
	
	ConstructorsDemo3(String name, double salary,  int numbersOfDaysWorked, double bonusPercentage){
		this.name=name;
		this.salary=salary;
		this.bonus=1000;
		this.numbersOfDaysWorked=numbersOfDaysWorked;
		this.bonusPercentage=bonusPercentage;
		
	}
	void printBonus() {
		//int numbersOfDaysWorked=0;
		if(numbersOfDaysWorked>300) {
			bonus=1000;
		}else {
			bonus=5000;
		}
		
	}
	
	public static void main(String[] args) {
		
		ConstructorsDemo3 ramObj=new ConstructorsDemo3("Ram", 100000, 300, 100);
		ramObj.printBonus();
		System.out.println(ramObj.name);
		System.out.println(ramObj.salary);
		System.out.println(ramObj.bonus); 
		System.out.println(ramObj.numbersOfDaysWorked);
		System.out.println(ramObj.bonusPercentage);
		//ramObj.printBonus(); //nothing print
		//System.out.println(ramObj.bonus); //5000
	}

}
