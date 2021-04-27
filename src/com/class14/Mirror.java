package com.class14;

public class Mirror {

	
	
boolean isMirror (String str) {
		
		String newStr="";
		for (int i=str.length()-1; i>=0; i-- ) {
			System.out.println(i+" "+str.charAt(i));
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		
		if(str.equals(newStr)) {
			return true;
		}else {
			return false;
		}
			
	}
	
}
	

