package com.class24.demo5;

public class WebDriver {
    void openWebsite(){
        System.out.println("Opening the website");
    }
    void closeWebsite(){
        System.out.println("Opening the website");
    }
    void loginWebsite(){
        System.out.println("Opening the website");
    }
    void signupWebsite(){
        System.out.println("Opening the website");
    }
    void downloadAFileFromWebsite(){
        System.out.println("Opening the website");
    }
}

class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening the website in Google Chrome");
    }
    void closeWebsite(){
        System.out.println("Closing the website in Google Chrome");
    }
    void loginWebsite(){
        System.out.println("Login on website in Google Chrome");
    }
    void signupWebsite(){
        System.out.println("Sign Up on website in Google Chrome");
    }
    void downloadAFileFromWebsite(){
        System.out.println("Download a file from the website in Google Chrome");
    }

}
class FireFox extends WebDriver{
    void openWebsite(){
        System.out.println("Opening the website in FireFox");
    }
    void closeWebsite(){
        System.out.println("Closing the website in FireFox");
    }
    void loginWebsite(){
        System.out.println("Login on website in FireFox");
    }
    void signupWebsite(){
        System.out.println("Signup on  website in FireFoxe");
    }
    void downloadAFileFromWebsite(){
        System.out.println("download A File From website in FireFox");
    }
}