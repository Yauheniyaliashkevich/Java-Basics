package reviewclass10.interfaceclass;

public interface Interface1I {
    int number=10;
    void method1();
    default void method2(){
        System.out.println(" default method 1");
    }
    static void method3(){
        System.out.println(" static method 3");
    }
}
