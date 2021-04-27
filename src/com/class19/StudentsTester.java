package com.class19;

public class StudentsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students objJane=new Students("Jane", 100,90,80);
		objJane.averageGrade();
		System.out.println(objJane.name+" has grade "+objJane.averageGrade());

		Students objVlad=new Students("Vlad", 90,95,80);
		objVlad.averageGrade();
		System.out.println(objVlad.name+" has grade "+objVlad.averageGrade());

		Students objVova=new Students("Vova", 95,85,100);
		System.out.println(objVova.name+" has grade "+objVova.averageGrade());

	}


}
