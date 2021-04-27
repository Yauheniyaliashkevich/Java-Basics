package com.class28.interfacess;

import com.class28.interfacess.Child1;
import com.class28.interfacess.InterfaceI1;
import com.class28.interfacess.InterfaceI2;

public class InterfaceITester {
    public static void main(String[] args) {
        InterfaceI1 interfaceI1=new Child1();
        InterfaceI2 interfaceI2=new Child1();
        interfaceI1.method();
        interfaceI2.method();
    }
}
