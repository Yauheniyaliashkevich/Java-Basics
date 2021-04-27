package com.class28.encapsulation;

public class BankTester {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("kat", "kat", "123", 1000);

        bankAccount.login("kat", "123");
        //bankAccount.password="456"; //CE
        System.out.println(bankAccount.getBalance("kat", "123"));



    }
}
