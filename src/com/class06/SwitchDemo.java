package com.class06;

public class SwitchDemo {

	public static void main(String[] args) {
        
		int month=3;
		String mounth;
		
		if      (month==1) { //work with conditions, it evaluates if condition is true or false
			mounth="January";
		}else if(month==2) {
			mounth="February";
		}else if(month==3) {
			mounth="March";
		}else if(month==4) {
			mounth="April";
		}else if(month==5) {
			mounth="May";
		}else if(month==6) {
			mounth="June";
		}else if(month==7) {
			mounth="July";
		}else if(month==8) {
			mounth="August";
		}else if(month==9) {
			mounth="September";
		}else if(month==10) {
			mounth="Octoder";
		}else if(month==11) {
			mounth=" November";
		}else if(month==12) {
			mounth=" December";
		}else {
			mounth="Invalid";
		}
		
		if(!mounth.equals("Invalid")){
			System.out.println("Today is "+mounth);
		}
		
		System.out.println("-----usung switch----------");
		String mounth1;
		
		switch(month) {// is a value based
		
		// we CANNOT have duplicate cases
		//values MUST match a variable type
		//we MUST have break in every cases
		
		case 1:
			mounth1="January";
		    break;
		case 2:
			mounth1="February";
			break;	
		case 3:  // it jumps right away to the matching case
			mounth1="March";
			break;	
		case 4:
			mounth1="April";
			break;	
		case 5:
			mounth1="May";
			break;	
		case 6:
			mounth1="June";
			break;
		case 7:
			mounth1="July";
			break;
		case 8:
			mounth1="August";
			break;	
		case 9:
			mounth1="September";
			break;	
		case 10:
			mounth1="Octode";
			break;	
		case 11:
			mounth1="November";
			break;	
		case 12:
			mounth1="December";
			break;	
		default:
			mounth1="Invalid";
			//break;
			
		}
		
		if (!mounth.equals("Invalid")) {
				
		System.out.println("Today is "+mounth1);
		
		}
		
		
		
		
		
		

	}

}
