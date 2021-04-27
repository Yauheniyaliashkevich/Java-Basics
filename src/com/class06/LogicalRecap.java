package com.class06;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		
		/*we need to get time
		 * based on the time we need to identify what is the time of day
		 * if time is between 1 to 11--> morning
		 * if time is between 12 to 13 --> noon
		 * if time is between 14 to 17 --> afternoon
		 * is time is between 18 to 21 --> evening
		 * if time is between 22 to 24 --> night
		 */
		
		Scanner scan;
		double time;
		String timeOfTheDay = "Invalid";
		
		 
		scan=new Scanner(System.in);
		
		System.out.println("Please enter time in 24 hour formal");
		time=scan.nextDouble();
		
		
		if(time>=1 && time<=11) {
			timeOfTheDay="Morning";
		}else if (time>=12  && time<=13) {
			timeOfTheDay="Noon";
		}else if(time>=14  && time<= 17) {
			timeOfTheDay="Afternoon";
		}else if(time>=18 && time<=21) {
			timeOfTheDay="evening";
		}else if(time>=22 && time<=24) {
			timeOfTheDay="Night";
		}
		
		System.out.println("Based of the entering time, time of the day is "+timeOfTheDay);

		/* compiler can initialized variable to their default values:
		 * default value of int --> 0
		 * default value of double --> 0.0
		 * default value of boolean --> true
		 * default value of String or all non primitives --> null
		 */
		
		double d=10;
		System.out.println(d); //10.0
		
		
		
		
		
	}

}
