package com.class19;

public class Students {
	/*
	 * Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. 
	 * Test Student class for 5 different students with different marks. 
	 * Your program should print an average mark of each students name.
       NOTE: please use different names for instance and local variables.
	 */
	String name;
	int subject1;
	int subject2;
	int subject3;
	int average;

	Students(String name1, int subject11, int subject22, int subject33){
		name=name1;
		subject1=subject11;
		subject2=subject22;
		subject3=subject33;

	}

	int averageGrade(){
		average=(subject1+subject2+subject3)/3;
		return average;

	}
}
