package reviewClass9.demo3Overloading;

public class OveloadingDemo {
    public static void main(String[] args) {
        String name="Yuliya is a good student yuliya get new job";
        System.out.println(name.indexOf("Yuliya"));
        System.out.println(name.indexOf("Yuliya", 10));


    }

    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b,double c){
        System.out.println(a+b+c);
    }
}
