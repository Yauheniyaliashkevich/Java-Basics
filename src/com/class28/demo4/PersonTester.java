package com.class28.demo4;

import com.class28.demo4.Emp;
import com.class28.demo4.Person;
import com.class28.demo4.SyntaxEmployee;

public class PersonTester {
    public static void main(String[] args) {
        SyntaxEmployee syntaxEmployee=new Emp();
        syntaxEmployee.sleep();
        syntaxEmployee.eat();
        syntaxEmployee.work();
        syntaxEmployee.teach();
        System.out.println("_________________");
        Person person=new Emp();
    }

}
