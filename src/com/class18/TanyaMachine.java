package com.class18;

import java.util.Scanner;

public class TanyaMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int itemPrice, quarters, dimes,nickels, change, rem,rem2;
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Which is a price for the item you would like to purchase");
		itemPrice=keyboard.nextInt();
		if ((itemPrice<=100 && itemPrice>=25)|| (itemPrice%5==0)) {
			change=100-itemPrice;
			quarters=change/25;
			rem=change-(quarters*25);
			dimes=rem/10;
			rem2=rem-(dimes*10);
			nickels=rem2/5;
			System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes,"+nickels+" nickels.");
			
		}
		else {
			System.out.println("Invalid price!");
			}
	}

}
