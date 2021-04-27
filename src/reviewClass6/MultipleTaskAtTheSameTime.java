package reviewClass6;

public class MultipleTaskAtTheSameTime {
    public static void main(String[] args) throws InterruptedException{
        googleChrome();
        intelliJ();
        slack();
    }

    public static void googleChrome() throws InterruptedException {
        System.out.println("Google Chrome is running");
        Thread.sleep(1000);
    }

    public static void intelliJ() throws InterruptedException{
        System.out.println("IntrlliJ chrome is running");
        Thread.sleep(5000);
    }
    public static void slack() throws InterruptedException{
        System.out.println("Slack is running");
        Thread.sleep(3000);
    }

}
