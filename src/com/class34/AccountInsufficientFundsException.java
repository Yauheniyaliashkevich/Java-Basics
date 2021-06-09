package com.class34;

public class AccountInsufficientFundsException extends RuntimeException{
    AccountInsufficientFundsException (String msg){
        super(msg);
    }
}
