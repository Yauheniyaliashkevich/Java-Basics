package com.class03;

public class DoubleComparison {
	//to autocomplere : ctrl+space+enter
	public static void main(String[] args) {
		
		//compare 2 numbers --> 3 possible conditions
		double a=2;
		double b=21;
		
		if(a>b) {
			System.out.println("Double value" +a+ " is larger than "+b);
		}else if (a<b){
			System.out.println("Double value "+b+ " is larger than "+a);
		}else { // else if(a==b)
			System.out.println(a+" is equal to "+b);
		}
		
		System.out.println("------------------");
		
		
		//2. baced on the day number define a day
		
		int day=0;
		
		if(day==1) {
			System.out.println("Taday is Monday");
		}else if(day==2) {
			System.out.println("Today is Tuesday");
		}else if(day==3) {
			System.out.println("Today is Wednesday");
		}else if(day==4) {
			System.out.println("Today is  Thursday");
		}else if(day==5) {
			System.out.println("Today is Friday");
		}else if(day==6) {
			System.out.println("Today is Saturday");
		}else if(day==7){
			System.out.println("Today is Sunday");
		}else {
			System.out.println("This date is invalid day");
		}
		// to format code: cmd +shift+f ---> mac users
		
		
		
	}

}
