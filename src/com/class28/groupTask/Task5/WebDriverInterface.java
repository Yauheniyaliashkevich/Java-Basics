package com.class28.groupTask.Task5;

public interface WebDriverInterface {
    Void open();
    void close();
    String getTitle();
}

interface TakesScreenshotInterface{
    void getScreenshot();
}

interface RemoteWebDriverInterface extends WebDriverInterface, TakesScreenshotInterface{


    public void navigate();
}

class ChromeDriverClass implements RemoteWebDriverInterface{
    @Override
    public void getScreenshot() {
        // TODO Auto-generated method stub
        System.out.println("Open Chrome");
    }
    @Override
    public Void open() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void close() {
        // TODO Auto-generated method stub

    }
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void navigate() {
        // TODO Auto-generated method stub

    }

}

class FirefoxDriverClass implements RemoteWebDriverInterface{
    @Override
    public void getScreenshot() {
        // TODO Auto-generated method stub
        System.out.println("Get screen shot Firfox");
    }
    @Override
    public Void open() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void close() {
        // TODO Auto-generated method stub

    }
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void navigate() {
        // TODO Auto-generated method stub

    }

}
class SafariDriverClass implements RemoteWebDriverInterface{
    @Override
    public void getScreenshot() {
        // TODO Auto-generated method stub

    }
    @Override
    public Void open() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void close() {
        // TODO Auto-generated method stub

    }
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void navigate() {
        // TODO Auto-generated method stub

    }

}
