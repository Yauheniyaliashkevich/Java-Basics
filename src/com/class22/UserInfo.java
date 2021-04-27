package com.class22;

public class UserInfo extends UserName{
    String address;
    UserInfo (String name, String number,String address){
        super(name,number);
        this.address=address;

    }

    void userDetails (){
        System.out.println(name+" has phone number "+number+" and address "+address);
    }

}
