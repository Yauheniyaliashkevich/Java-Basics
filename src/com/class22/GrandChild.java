package com.class22;





class GrantParent{
        String color="White";
        void print(){
            System.out.println(color);
        }
    }
    class Grantparenttt extends GrantParent{
        //String color="Black";
}
public class GrandChild extends Grantparenttt {
    String color = "Red";

    void printInfo() {
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }


    public static void main(String[] args) {
        GrandChild grandChild=new GrandChild();
        grandChild.printInfo();
        grandChild.print();
    }
}

