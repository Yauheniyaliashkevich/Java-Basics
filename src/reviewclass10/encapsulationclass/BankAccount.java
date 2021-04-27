package reviewclass10.encapsulationclass;

public class BankAccount {
    private double accountBalance=100000;
    private String password="123";



    public double getBalance(String pessword){
        if (this.password==password){
            return accountBalance;
        }else{
            return -1;
        }
    }
}
