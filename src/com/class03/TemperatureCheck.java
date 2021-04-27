package com.class03;

public class TemperatureCheck {
	public static void main(String[] agrs ) {
		
		int temp=100;
		
		
		if (temp>=32) {
			System.out.println("I am a if block");
			System.out.println("Water will freeze with temperature "+temp);
		    System.out.println("It is very cold");
		}else {
			System.out.println("I am a else block");
			System.out.println("Water will NOT freeze with temperature "+temp);
		}
		
		
		System.out.println("-----------------");
		
		double money=3;
		double $coke=3;
		
		if (money==$coke) {
			System.out.println("I will buying soda");
		}else {
			System.out.println("I need exact amount");
		}
		
		System.out.println("-----------------");
		
		boolean snow=true;
		
		if(snow) {
			System.out.println("Yay,I will play with the snow");
		}else {
			System.out.println("I am going to rie my bicycle");
		}
		
		System.out.println("-----------------");
		
		boolean summer=true;
		if(summer) {
			System.out.println("I am going to Florida");
		}else {
			System.out.println("I am stay at home");
		}
		
		
		
		
		
	}

}
