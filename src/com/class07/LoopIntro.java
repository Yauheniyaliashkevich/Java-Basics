package com.class07;

public class LoopIntro {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		System.out.println("-----------------------------------");
		int time=17;
		
		if(time<12) {
			System.out.println("Hello"); //code executes 1 time
		}
		
		System.out.println("---------WHILE LOOP----------------");
		
		while(time>12) {
			System.out.println("Hello"); // code runs infinitely / forever
			time--;
		}
			
			System.out.println("------------------- print numbers 1 to 10----------------");
			
			int num=1;
			while (num<11) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			System.out.println("------------------- print numbers 20 to 40----------------");
			
			
			int b=20;
			while (b<=40) {
				System.out.print(" "+b);
				b++;
			}
			
			System.out.println();
			System.out.println("------------------- print numbers from 10 to 1----------------");
		
		    int a=10;
		    
		    while (a>=1) {
		    	System.out.print(a+" ");
		    	a--;
		    }
		
	}

}
