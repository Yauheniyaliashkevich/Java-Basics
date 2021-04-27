package com.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan;
		int quiz;
		int midTerm;
		int finalScore;
		int average;
		char grade;
		
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your quiz score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter your midTerm score");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter your final score");
		finalScore=scan.nextInt();
		
		average=(quiz+midTerm+finalScore)/3;
		
		
		if (average>=90) {
			grade='A';
		}else if(average>=70 && average<90) {
			grade='B';
		}else if (average>=50 && average<70) {
			grade='C';
		}else  {
			grade='F';
		}
		
	    System.out.println("Your grade is "+grade);
		
	    if(grade=='A'  || grade=='B' ) {
	    	System.out.println("I am happy!!!");
	    }
		
		
		
		
		
		
		
		
		
	}

}
