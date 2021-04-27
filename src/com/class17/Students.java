package com.class17;

public class Students {
	/*
	 * Create a Class called Students
Create three  variables  studentName , studentID  and  numberOfStudents
Create three objects of the Students Class 
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
	 */
	
	String studentName;
	String studentID;
	static int numberOfStudent;
	
	
	
	public static void main(String[] args) {
		Students janeObj=new Students ();
		janeObj.studentName="Jane";
		janeObj.studentID="JD123";
		numberOfStudent++;
		
		Students dashaObj=new Students ();
		janeObj.studentName="Dasha";
		janeObj.studentID="GH443";
		numberOfStudent++;
		
		Students yuliyaObj=new Students ();
		janeObj.studentName="Yuliya";
		janeObj.studentID="HJ233";
		numberOfStudent++;
		
		System.out.println(numberOfStudent);
	
	}

}
