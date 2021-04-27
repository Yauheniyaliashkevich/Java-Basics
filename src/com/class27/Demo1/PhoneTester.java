package com.class27.Demo1;

import com.class27.Demo1.Iphone;
import com.class27.Demo1.Phone;
import com.class27.Demo1.Samsung;

public class PhoneTester {
    public static void main(String[] args) {


        Phone iphone = new Iphone();
        iphone.unlockPhone();
        Phone samsungPhone=new Samsung();
        samsungPhone.displayPictures();
        samsungPhone.makeCalls();

        //Phone phone=new Phone();We are not allowed because it is not implementation in abstract class
    }
}
