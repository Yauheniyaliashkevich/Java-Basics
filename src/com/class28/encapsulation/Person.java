package com.class28.encapsulation;

public class Person {
    private String name;
    private String bankAccountNumber;
    private String address;
    private String SSN;

    void setName(String name) {
        if (name.length() < 15) {
            if (name.matches("^[A-Za-z]*$")) {
                this.name = name;
            } else {
                System.out.println("Only chapters are allowed");
            }
        } else {
            System.out.println("Name longer than 15 characters are not allowed");
        }
    }
        String getName(){
            return name;
        }

}
