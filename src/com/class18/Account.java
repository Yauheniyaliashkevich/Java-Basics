package com.class18;

public class Account {

	private double accountBalance;
	private String userName;
	private String password;
	
	public boolean login (String enteredUserName, String enteredPassword){
		if(enteredUserName.equals(userName) && enteredPassword.equals(password)) {
			return true;
		}else {
			return false;
		}
		//return enteredUserName.equals(userName) && enteredPassword.equals(password);
		
	}	
	
	public boolean signUp (String enteredUserName, String enteredPassword, double enteredBalance) {
		
		if(enteredUserName.length()>15) {
			return false;
		}else {
			userName=enteredUserName;
			password=enteredPassword;
			accountBalance=enteredBalance;
			return true;
		}
		
	}
	
	
	boolean transferFunds (String Password, double enteredAccountBalance) {
		if( Password.equals("pass123") && enteredAccountBalance<=accountBalance) {
			accountBalance=accountBalance-enteredAccountBalance;
			return true;
		}else {
			return false;
		}
	}
}
