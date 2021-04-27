package com.class28.groupTask.Task2;



public abstract class Marks {
    abstract double getPercentage();

}
class  A extends Marks{
    double sub1;
    double sub2;
    double sub3;

    public A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    double getPercentage() {
        double average=(sub1+sub2+sub3)/3;
        return average;
    }
}
class B extends Marks{
    double sub1;
    double sub2;
    double sub3;
    double sub4;

    public B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    double getPercentage() {
        double average=(sub1+sub2+sub3+sub4)/4;
        return average;
    }
}
