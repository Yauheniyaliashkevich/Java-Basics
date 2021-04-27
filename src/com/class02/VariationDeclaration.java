package com.class02;

public class VariationDeclaration {

	public static void main(String[] args) {
		
		//1 way to create a variable
		short b=200; //create a variable and assign value
		             //declare a variable and initialized 
	
	    //2 way
		int sum; // declaration happens ONLY ONCE
		sum=20; //initialized the variable
	
	    sum=30; //reassign the value
	
	    /*
	     * int x;
	     * int y;
	     * int z;
	     */
	    
	    int x,y,z,w,q;
	    
	    x=10;
	    y=20;
	    //z=30.9; Error: Type Mismatch, since variable can store only int type of value
	    
	    //I would like to change the of x
	    
	    x=70;
	    
	    System.out.println(x);
	    
	    int num=33;
	    
	    //we are using value of different variable to initialize the value of new variable
	    int num2=num; //33
	    
	    System.out.println(num2);
	
	
	
	}
	

}
