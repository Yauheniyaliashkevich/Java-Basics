package com.class07;

public class InclassTask {
	public static void main(String[] args) {
		
		System.out.println("--------- 1 to 100 --------------");
		int num1=1;
		
		while (num1<=100) {
			System.out.print(num1+" ");
			num1++;
		}
		
		
		System.out.println("--------- 100 to 1 --------------");
		int num2=100;
		
		while (num2>=1) {
			System.out.println(num2);
			num2 --;
		}
		
		System.out.println("---------- print even numbers from 20 to 100 ---------");
		
		int num3=20;
		
		while ( num3 <=100 ) {
			System.out.println(num3);
			num3+=2;
		}
		
		System.out.println("------------ if -----------");
		
		int a=20;
		while (a <=100) {
			if ( a %2 ==0) {
		         System.out.print(a+ " ");
		    }
		a++;
	    }
		
		
		
		System.out.println("------------------");
		
		
		
		
		
		
		
		
	}

}
