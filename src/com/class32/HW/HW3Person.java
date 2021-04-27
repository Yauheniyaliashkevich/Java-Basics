package com.class32.HW;

public class HW3Person {
    /*
    Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
     */
    private String name;
    private String lastName;
    private Integer age;
    private Double salary;

    public HW3Person(String name, String lastName, Integer age, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void printDetails(){
        System.out.println("First name: "+name+" Last Name: "+lastName);
        System.out.println("Age: "+age+" Salary: "+salary);
    }

    @Override
    public String toString() {
        return "HW3Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
