package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		
		//keywords - a special word that reserved in java memory: class,public, static, final,for
		
		//identifiers - name that we give to classes, variable and methods
		
		
		/* RULE ! ! ! !
		 * DO NOT USE KEYWORD AS IDENTIFIERS
		 * Identifiers CANNOT contain space
		 * Identifiers CANNOT start with numbers
		 * Identifiers CANNOT have any special characters, except : _ of $
		 */
		
		//1. int final=10; error: INVALID INDETIFIER
		
		//2. byte variable one=12;
		
		//3. short 1b=12;
		     short b1=12;
		//4. long *l=2000;
		//   long l*=2000; 
		     long _l=20000;
		     long long_=20009;
		     
		     double $price=12.99;
		     double price$=10.99;
		     
		//NamingConvention     
		    // 1.we use camel casing
            // 2. classes start with Upper cases and will follow camel casing
		    // 3. variables start with lower case and will follow camel casing 
		    // 4. packages we use lower case and use name as reverse way of rule
		    // 5. use meaningful name for your variable 
		     
		int Number=12;//try not to use upper case names
		int number=12;//more preferable
		
		int numberOne=12;
		int numberTwo=13;
		
		boolean isSnow=true;
		boolean snow=true;
		
		double applePrice=12.99;
		double mangoPrice=13.89;
		
		
		
	}
	
	

}
