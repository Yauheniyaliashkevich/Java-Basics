package com.class24.demo5;

public class WebsiteTester {
    public static void main(String[] args) {
        WebDriver webDriver=new FireFox();
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downloadAFileFromWebsite();
        webDriver.closeWebsite();


        WebDriver [] webDriverArray={new GoogleChrome(),new FireFox()};
        for(WebDriver webDriver2:webDriverArray){
            {
                webDriver2.openWebsite();
                webDriver2.signupWebsite();
                webDriver2.downloadAFileFromWebsite();
                webDriver2.closeWebsite();
            }
        }
        /*FireFox fireFox=new FireFox();
        fireFox.openWebsite();
        fireFox.signupWebsite();
        fireFox.downloadAFileFromWebsite();
        fireFox.closeWebsite();

        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signupWebsite();
        googleChrome.closeWebsite();
        googleChrome.downloadAFileFromWebsite();*/
    }
}
