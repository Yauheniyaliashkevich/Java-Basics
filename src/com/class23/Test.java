package com.class23;

public class Test {
    public static void main(String[] args) {
        System.out.println("Main from Parent");
    }
}

class Child1 extends Test{

    public static void main(String[] args) {
        System.out.println("Main from Child");
    }

}

class Child2 extends Parent{

    public static void main(String[] args) {
        String [] args1= {"hi"};
        Child1.main (args1);
    }
}