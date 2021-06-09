package com.class34;

import Repl.A;

public class Demo900 {
    public static void main(String[] args) {
        Account account=new Account(100.0);
        try{
            account.transfer(1000);
        }catch (AccountInsufficientFundsException e){
            e.getMessage();
        }

    }
}
