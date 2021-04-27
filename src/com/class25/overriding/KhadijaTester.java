package com.class25.overriding;

public class KhadijaTester {
    public static void main(String[] args) {

        Object [] arr={new String("Test"), new Khadija("Ksdk")};
        /*KFather obj1=new Ozoda("Khadija");
        obj1.eat();
        obj1.sleep();*/
        //String as=new Khadija("name"); CE because no inheritance relationship
        //executeAllMethods(new KFather("Mirza"),new Ozoda("Ozoda"),new Khadija("Khagija"));
        KFather []kFatherArr={new KFather("Mirza"),new Ozoda("Ozoda"),new Khadija("Khagija")};
        executeAllMethods(kFatherArr);



    }
    static void executeAllMethods(KFather kFather,Ozoda ozoda,Khadija khadija){
        kFather.eat();
        kFather.sleep();
        khadija.eat();
        khadija.sleep();
        ozoda.eat();
        ozoda.sleep();
    }

    static void executeAllMethods(KFather[] kFathersArr){

        for(KFather kFather:kFathersArr){
            kFather.sleep();
            kFather.eat();
        }

    }
}
