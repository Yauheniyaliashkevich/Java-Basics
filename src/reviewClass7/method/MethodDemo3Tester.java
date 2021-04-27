package reviewClass7.method;

public class MethodDemo3Tester {
    public static void main(String[] args) {
        String name=null;
        MethodDemo3 methodDemo3=new MethodDemo3();

        int [] numbers={1,2,3,4,5};

        if (methodDemo3.sumTheOdds(numbers)>2){
            System.out.println("Sum is greater than 2");
        }
    }
}
