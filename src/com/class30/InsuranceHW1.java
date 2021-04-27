package com.class30;

public abstract class InsuranceHW1 {
    /*
    Create a class Insurance that will have an attribute as insuranceName
    and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute
     as carModel and Class Pet has petType attribute. Create 3 objects of
     the sub classes and store them in ArrayList. Using for loop/advanced
     for loop/ iterator access all methods of the class.
     */
    String insuranceName;
    InsuranceHW1(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends InsuranceHW1 {
    String carModel;

    Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    void getQuote(){
        System.out.println(insuranceName+" getQuote from Car "+carModel);
    }
    void cancelInsurance(){
        System.out.println(insuranceName+" cancelInsurance from Car "+carModel);
    }
}

class Pet extends InsuranceHW1{
    String petType;

    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" getQuote from Pet "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" cancelInsurance from Pet "+petType);
    }
}
class Health extends InsuranceHW1{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" getQuote from Health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" cancelInsurance from Health");
    }
}


