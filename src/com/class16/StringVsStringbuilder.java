package com.class16;

public class StringVsStringbuilder {

	public static void main(String[] args) {
		
		String var1="USAusa";
		String var2="USA";
		String var3="USA";
		String var4=new String("USA");
		System.out.println(var1==var2);
		System.out.println(var1==var4);
		System.out.println(var1.equals(var2));
		System.out.println(var1.equals(var4));
		
		
		StringBuilder sb=new StringBuilder (var1);
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder ("USAUSA");
		System.out.println("--------------------");
		System.out.println(sb1.capacity());
		
		var1=sb.toString();
		System.out.println(var1);
		
	}

}
