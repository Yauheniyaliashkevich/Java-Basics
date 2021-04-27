package reviewClass7.method;

public class MethodDemo2 {
    static void methodWithStaticModifier(){
        System.out.println("You can call me just writing the name of thw class");
        //instanceMethod(); need to create the object of this class
    }
    void instanceMethod(){
        System.out.println("You need an object of my class if you want to call me outside of this" +
                "class or in the static method");
        methodWithStaticModifier(); //I can call because static belong to the class not instance/object
    }
    void instanceMethod2(){
        methodWithStaticModifier();
        instanceMethod();
        String [] a={"bla bla"};
        main(a);
    }

    public static void main(String[] args) {
        methodWithStaticModifier();

        MethodDemo2 methodDemo2=new MethodDemo2();

    }
}
