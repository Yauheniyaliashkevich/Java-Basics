package com.class34;

public class Account {
    double balance;
    Account (double balance){
        this.balance=balance;
    }
    public void transfer (double amountToTransfer) throws AccountInsufficientFundsException,NullPointerException{
        if(balance < amountToTransfer){
            //System.out.println("Insufficient funds");
            throw new AccountInsufficientFundsException("Not enough balance"); //should be last line of code
            //System.out.println();
        }
    }
}
