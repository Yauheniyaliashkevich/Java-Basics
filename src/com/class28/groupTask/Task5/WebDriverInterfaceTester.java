package com.class28.groupTask.Task5;

public class WebDriverInterfaceTester {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        RemoteWebDriverInterface[] webDriverInterface= {
                new ChromeDriverClass(), new FirefoxDriverClass(), new SafariDriverClass()};
        for (RemoteWebDriverInterface webDriverInterface1: webDriverInterface) {

            webDriverInterface1.open();
            webDriverInterface1.navigate();
            webDriverInterface1.getTitle();
            webDriverInterface1.getScreenshot();
            webDriverInterface1.close();


        }
    }
}







