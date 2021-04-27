package reviewclass10.encapsulationclass;

public class FacebookTester {
    public static void main(String[] args) {
        Facebook facebook=new Facebook("asd@gmail.com", "1234");
        //facebook.email="blablabla@gmail.com";

        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.getBalance("blabla"));


        int age=0;
        int var1=10;
        /*if(var1>20){
            age=100;
        }else{
            age=50;
        }*/

        age=(var1>20)? 100:50;
        System.out.println(age);
    }
}
