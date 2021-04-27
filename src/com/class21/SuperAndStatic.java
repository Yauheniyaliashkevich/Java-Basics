package com.class21;

public class SuperAndStatic {
    String color;
    static void printInf(){
        //super.color="Green"; Error
        //color="Green"; Error
        //System.out.println(color); Error
    }

    public static void main(String[] args) {
        SuperAndStatic superAndStatic=new SuperAndStatic();
        superAndStatic.color="Red";
        SuperAndStatic superAndStatic1=new SuperAndStatic();
        superAndStatic1.color="White";
        SuperAndStatic superAndStatic2=new SuperAndStatic();
        superAndStatic2.color="Black";
        SuperAndStatic.printInf();
    }
}

class parent {
    String color;
}
