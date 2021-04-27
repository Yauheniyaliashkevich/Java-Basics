package com.class25;

public class StudentTester {
    public static void main(String[] args) {
        Student obj1=new SchoolStudent();
        obj1.text();
        SchoolStudent obj11=new SchoolStudent();
        obj11.school();

        Student obj2=new CollegeStudent();
        obj2.text();
        CollegeStudent obj22=new CollegeStudent();
        obj22.college();

        Student obj3=new SyntaxStudent();
        obj3.text();
        SyntaxStudent obj33=(SyntaxStudent)obj3;
        obj33.syntax();

    }
}
