package com.class11;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
	
	
	/* create an array on double values using scanner
	 * calculate the sum of all stored element in that array
	 * 
	 */

	Scanner scan=new Scanner(System.in);
    
    System.out.println("----------------------------- Class , not me -------------");
    
    double sum=0;
    
    System.out.println("Please enter the size of the arr");
    int size1=scan.nextInt();
    double [] a= new double [size1];
    
	for(int i=0; i<size1; i++) {
		a[i]=scan.nextDouble();
		sum+=a[i];
	}
	System.out.println("The sum of "+size1+" elements from an array ="+sum);
	
	System.out.println("------ Calculating sum using for each loop --------");
	sum=0;
	
	for(double num2:a) {
		sum+=num2;
	}
	
	System.out.println("The sum of "+size1+" elements from an array ="+sum);
	
	
}
	
}
