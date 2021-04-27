package com.class13;

public class Account {
	
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String passedUserName, String passedPassword) {
		if(userName.equals("Yuliya")&& password.equals("pass123")) {
			System.out.println("Welcome to bank of America your balance is "+balance);
		}else {
			System.out.println("Username or password is not correct");
		}
	} 
	
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your Account number is "+accountNumber+" Your balance is "+balance);
		}
		
	}	
		
		
		
		
		
		
	}


