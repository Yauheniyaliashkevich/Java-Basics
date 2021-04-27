package com.class28.interfaces;

import com.class28.interfaces.AdvanceChild;
import com.class28.interfaces.IParent;

public class InterfaceTester {
    public static void main(String[] args) {
       // IParent iParent=new IParent();
        IParent iParent=new AdvanceChild();
        iParent.method1();

    }
}
