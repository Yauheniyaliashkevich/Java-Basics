package com.class13;

public class BankApplication {
	
	public static void main(String[] args) {
		
	
	Account yauheniyaAccount= new Account();
	yauheniyaAccount.accountNumber="123";
	yauheniyaAccount.userName="Jane123";
	yauheniyaAccount.password="pass123";
	yauheniyaAccount.balance=1455;
	yauheniyaAccount.login("Jane123", "pass123");
	
	
	System.out.println("_----------");
	}
	
}
