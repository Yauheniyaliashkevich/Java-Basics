package reviewclass10.encapsulationclass;

public class Facebook {
    private String email;
    private String password;

    public Facebook(String email, String password){
        setEmail(email);
    }
    public void resetPassword(){
        System.out.println("An Email has been "+ "sent to your email Id "
                +email+" click on that link to reset your password");
    }



    public void setEmail(String email){
        if (email.contains("@") && email.endsWith(".com")){
            this.email=email;
        }

    }

}
