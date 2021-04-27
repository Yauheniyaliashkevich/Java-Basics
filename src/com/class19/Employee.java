package com.class19;

public class Employee {
    private String name;
    private String empID;
    private double salary;
    private String department;

    Employee(){
        System.out.println("Line 1 ");
        System.out.println("Line 2 ");
        System.out.println("Line 3 ");
        System.out.println("Line 4 ");
        System.out.println("Line 5 ");
    }
    public Employee(String name){
        this();
        //this.name=name;
        this.name=ValidateName(name);


    }
    public Employee(String name, String empID){
        //this.name=name;
        /*this.name=ValidateName(name);*/
        this(name);
        this.empID=empID;

    }
    public Employee(String name, String empID, double salary){
        //this.name=name;
        this(name, empID);
        /*this.name=ValidateName(name);
        this.empID=empID;*/
        this.salary=salary;


    }

    public Employee(String name, String empID, double salary, String department){
        //this.name=name;
        this(name, empID, salary);
        /*this.name=ValidateName(name);
        this.empID=empID;
        this.salary=salary;*/
        this.department=department;
    }






    void printInfo(){
        System.out.println("Name "+name+" Employee ID "+empID);
    }

    String ValidateName (String name){
        if(name.length()<15){
            return name;
        } else {
            return null;
        }





    }
}
