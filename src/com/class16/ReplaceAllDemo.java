package com.class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1="Syntax is best34343. Batch nine is great";
		System.out.println(var1.replaceAll("[0-9]", ""));
		var1="96234562356236437isdfdRRRRfjdxjRf$$";
		System.out.println(var1.replaceAll("[a-zA-Z0-9$%]" , ""));
		var1="96234df562356236437isdfdRRRRfjdxjRf&#^%$^@&)$$";
		System.out.println(var1.replaceAll("[A-Za-z0-9]", ""));
		
	}

}
