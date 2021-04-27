package com.class17;

import com.class18.AccessModifierDemo;

public class DemoFromOtherPackage {

	public static void main(String[] args) {
		
		AccessModifierDemo obj1=new AccessModifierDemo();
		System.out.println(obj1.name);
		//System.out.println(obj1.bankAccountPassword);
		// System.out.println(obj1.SSNNumber); //Default for package - class 18
		

	}

}
