package com.class07;

public class InclassTask1 {
	public static void main(String[] args) {
		
	   System.out.println("----------- 1 to 100 -----------");
		
	   for( int i=1; i<=100; i++) {
		   System.out.print(i+" ");
	   }
		
	   System.out.println();
	   System.out.println("----------- 100 to 1 -----------");
		
	   for (int i=100; i>=1; i--) {
		   System.out.print(i+" ");
	   }
	   
	   System.out.println();
	   System.out.println("----------- even numbers from 20 and 1. 1 way -----------");
		
		for(int i=20; i%2==0 && i>=1; i-=2 ) {
			System.out.print(i+" ");
		}
		
		System.out.println();
	    System.out.println("----------- even numbers from 20 and 1. 2 way -----------");
		
	    int i=20;
	    while (i%2==0 && i>=1) {
	    	System.out.print(i+" ");
	    	i-=2;
	    }
	    
	    System.out.println();
	    System.out.println("----------- odd numbers beetween 20 and 50. 1 way -----------");
	    
	    for (int ii=20;  ii<=50 ; ii++) {
	    	if (ii%2==1) {
	    	System.out.print(ii+" ");
	    	}
	    }
	    
	    System.out.println();
	    System.out.println("----------- odd numbers beetween 20 and 50. 2 way -----------");
	    
	    int ii=20;
	    ii+=1; 
	    while(ii%2==1 && ii<=50) {
	    	System.out.print(ii+" ");
	    	ii+=2;
	    }
	    System.out.println();
	    System.out.println("----------- WHAT IS THE OUTPUT?");
	    
	    int sum=0;
	    for (int iii=1; iii<=5; iii++ ) {
	    	sum=sum+iii;
	    }
	    System.out.println(sum);
	    
	    
	    System.out.println();
	    System.out.println("----------- WHAT IS THE OUTPUT?");
	    
	    
	    int result=0;
	    for (int a=2; a<10; a+=2) {
	    	result +=a;
	    }
	    System.out.println(result);
	    
	}

}
