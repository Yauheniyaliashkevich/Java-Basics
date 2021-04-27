package com.class30;

public abstract class Card {
    /*
    Create a Card class that will have implemented  and
     unimplemented methods and a constructor that will initializes
      credit card type.  Create 3 subclasses of a Card card.
      Create 3 objects of different card and store them into LinkedList.
       Using for loop/advanced for loop/ iterator access all methods of the class.
     */

    String creditCardType;
    Card(String creditCardType){
        this.creditCardType=creditCardType;
    }

    void method1(){
        System.out.println("Method1 from Card class "+creditCardType);
    }
    abstract void method2();
}

class Visa extends Card{


    Visa(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void method2() {
        System.out.println("Method2 from class "+creditCardType);
    }
}

class MasterCard extends Card{

    MasterCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void method2() {
        System.out.println("Method2 from class "+creditCardType);
    }
}
class MirCard extends Card{

    MirCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void method2() {
        System.out.println("Method2 from class "+creditCardType);
    }
}
