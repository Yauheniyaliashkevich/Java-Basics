package com.class10;

public class ReviewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		System.out.println("int i=10; \n" +i);
		i=i+20;
		System.out.println("int i=10; \n"+i);
        i+=10;		
        System.out.println("int i=10; \n"+i);
		i++;
		System.out.println("int i=10; \n"+i);
		++i;
		System.out.println("int i=10; /n"+i);
		
		i=10;
		System.out.println("++i "+(++i)); 
        System.out.println("i++ "+(i++));
        System.out.println("i "+i);
        
        
        
        System.out.println("------------Simple while loop------------------------");
	
	    int var=0;
	    while (var<5) {
	    	System.out.println(" var"+5);
	        var++;
	    }
	
	    System.out.println("------------While loop with break and continue------------------------");
	    
	    int a=10;
	    while (a<15) {
	    	if (a<15) {
	    		continue;
	    	}else {
	    		System.out.println("Hi");
	    	}
	    	a++;
	    }
	    
	    
	   
	
	
	}

}
