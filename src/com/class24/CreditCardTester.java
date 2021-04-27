package com.class24;

public class CreditCardTester {

    public static void main(String[] args) {

        CreditCard obj=new CreditCard();
        System.out.println(obj.calculate(1000,0.05));

        AX ax=new AX();
        System.out.println(ax.calculate(1500, 0.02));

        Visa visa=new Visa();
        System.out.println(visa.calculate(4000, 0.04));

    }

}
