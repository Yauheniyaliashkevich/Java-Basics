package reviewClass8;

public class Parent {
    private String bankAccount;
    public String name;

    public Parent(String bankAccount, String name) {
        this.bankAccount = bankAccount;
        this.name = name;
    }

    public void method1(){
        System.out.println("Public method");
    }
    protected void method2(){
        System.out.println("Protected method");
    }
    private void method3(){
        System.out.println("Private method");
    }
    void method4(){
        System.out.println("Default method");
    }
}
class Child extends Parent{


    public Child(String bankAccount, String name) {
        super(bankAccount, name);
    }


    protected void method2(){
        super.method2();
        this.method1();
        super.method1();
    }
}
class grandChild extends Child{

    public grandChild(String bankAccount, String name) {
        super(bankAccount, name);
    }
}
