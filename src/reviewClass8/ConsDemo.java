package reviewClass8;

public class ConsDemo {
    String name;
    protected String address;
    public String phoneNumber;
    public ConsDemo(){
        System.out.println("Default constructor called");
    }

    ConsDemo(String name){
        this.name=name;
    }

    protected ConsDemo(String name, String address){
        System.out.println("Protected constructor called");
    }
    void method1(){
        System.out.println("Method with default access");
    }
    protected void method2(){
        System.out.println("Method with protected access");
    }
    private void method3(){
        System.out.println("Method with private access");
    }
    public void method4(){
        System.out.println("Method with public access");
    }

}
