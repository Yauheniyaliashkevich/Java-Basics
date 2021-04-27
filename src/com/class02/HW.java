package com.class02;

public class HW {

	public static void main(String[] args) {
        
		byte box01=111;//creating a variable and assigning value to it
		
		short box02=1111;
		
		int box03=11111111;
		box03=3000;
		long box04=1111111111111111L;
		
		float box05=11.11f;
		
		double box06=11.11111;
		
		char box07= 'J';
		
		boolean box08=true;
		
		System.out.println(box01);
		System.out.println(box02);
		System.out.println(box03);
		System.out.println(box04);
		System.out.println(box05);
		System.out.println(box06);
		System.out.println(box07);
		System.out.println(box08);
		
		int x=30;
		box03=2000;//reassign the value (change the value of the variable)
		System.out.println(box03);
		
		//byte box01=20; Java complains because now we have a duplicate variable
	    
		//box03=12.99; error: type mismatch : because variable box03 can only hold int type of values
        //c=true;
	}

}
