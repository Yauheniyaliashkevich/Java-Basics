package com.class16;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String var1="Today is Wednesday";
    String [] strArr=var1.split(" ");
    for (String word:strArr) {
    	System.out.println(word);
    }
    
    String var2="Syntax is best. Batch 9 is great";
    String [] strArr2=var2.split("[.]");
    
    for(int i=0; i<strArr2.length; i++) {
    	System.out.println(strArr2[i]);
    	
    	//method chaining
    	
    	String var3="       SYNTAX        ";
    	System.out.println(var3.trim().toLowerCase());
    	
    }
	}

}
