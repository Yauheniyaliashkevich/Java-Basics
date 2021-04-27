package com.class27;

import reviewClass8.ConsDemo;

public class Test extends ConsDemo {

    Test (){
        super("name", "address");
        //super.name="test"; default access cannot access it
        super.address="Chicago";
        method2();
        method4();
    }

    public static void main(String[] args) {
        ConsDemo consDemo=new ConsDemo();
        consDemo.phoneNumber="34556";
        consDemo.method4();
        Test test=new Test();
        //ConsDemo consDemo1=new ConsDemo("not allowed"); CE can not access

        //ConsDemo consDemo1=new ConsDemo("name","address");
    }
}
