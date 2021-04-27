package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		
		/*I want to capture 5 different names and say hello to every names
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner scan;
		String name;
		
		scan=new Scanner(System.in);
		
		int q=0;
		while (q<5) {
			
			System.out.println("Please enter your name");
			name=scan.nextLine();
			System.out.println("Hello "+name );
			
			q++;
		}
		
		
		
		
		
		
		
		
	}

}
