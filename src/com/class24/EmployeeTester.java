package com.class24;

import java.sql.SQLOutput;

public class EmployeeTester {
    public static void main(String[] args) {


        Employee employee=new Employee();
        employee.salary=100000;
        employee.getPaid();

        Contractor contractor=new Contractor();
        contractor.salary=50;
        contractor.getPaid();


        /*double var1=10;
        System.out.println(var1); //10.0
        int var2= (int)10.0;*/

        //widening or upcasting
        Employee constructor2=new Contractor();
        //narrowing or down casting
        Contractor contractor3=(Contractor) new Employee();
    }

}
