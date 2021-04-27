package com.class06;

public class SwitchExample {
	public static void main(String[] args) {
		
		/*store gender using M or F
		 * based on the gender we will specify
		 *       if M --> Male
		 *       if F --> Female
		 *       otherwise --> not sure
		 * 
		 */
		
		char gender='o';
		String description;
		
		switch(gender) {
		case 'M': 
			description= "Male";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="N/A";
		    break;
		
		
		}
		
		
		System.out.println(description);
		
		/*LIMITATION:
		 *  switch CANNOT use Relational or Logical Operators (it simple check a value)
		 *  switch CANNOT be used with boolean, double, long, float
		 * 
		 */
		
		boolean sunny=true;
		if (sunny) {
			System.out.println("I am happy");
		}
		double price=10.99;
		
		if (price>10) {
			System.out.println("Too expensive");
		}
		
		//switch (price) { //error
		
		//}                //error
		
		
		
		
		
		
		
	}

}
