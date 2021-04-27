package com.class27.Demo3;

public class Tester implements Test{
    @Override
    public void display(){
        System.out.println("Bla bla bla");
    }


    public static void main(String[] args) {
        Test test=new Tester();
        test.display();
        Test.method1();
        test.method2();

    }
}
