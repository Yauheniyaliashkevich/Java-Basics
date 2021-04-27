package com.class30;

import java.util.ArrayList;

public class StudentTester {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1,"Amna",35));
        students.add(new Student(2,"Aman",25));
        students.add(new Student(3,"Kse",105));
        students.add(new Student(4,"afzal",15));
        students.add(new Student(5,"Asghar",18));
        students.add(new Student(6,"Nazir",40));
        Student student=new Student(3,"Kse",105);

        students.remove(student);
        System.out.println(students);


    }
}
