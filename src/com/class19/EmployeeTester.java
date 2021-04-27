package com.class19;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee juanObj=new Employee("Juan","123",150000, "IT");
        Employee juanObj1=new Employee("Juan","123",150000 );
        Employee juanObj2=new Employee("Juan","123");
        Employee juanObj3=new Employee();



        /*Employee juanObj= new Employee();
        juanObj.name="Juan";
        juanObj.empID="123"; // bad approach*/
        String[] a={"Jane", "Vlad"};
        main(a); //infinite loop
    }


}
