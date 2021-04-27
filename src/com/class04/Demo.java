package com.class04;

import java.util.Scanner;

//shortcut for import for mac: cmd+shift"o
public class Demo {
   public static void main(String[] args) {
	
	 
	 
	 Scanner scan=new Scanner(System.in);
	 
	 System.out.println("Please enter any text");
	                            //capture entire text with space
	 String text=scan.nextLine(); //scan.nextLine(): --> capture your input from console,
	                                    //once you enter text you MUST HIT ENTER
	 System.out.println("Text that I entered is "+text);
	 
	 System.out.println("Please enter you name");
	 String name=scan.next();//capture one word till space
	 System.out.println("Nice to meet you "+name );
	 System.out.println("Please enter your age");
	 
	 int age=scan.nextInt();
	 System.out.println("My name is "+name+" and I am "+age+" years old");
	 
	 
   }
}
