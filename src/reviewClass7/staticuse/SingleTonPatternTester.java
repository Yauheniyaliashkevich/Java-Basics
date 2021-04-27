package reviewClass7.staticuse;

public class SingleTonPatternTester {
    public static void main(String[] args) {


        //SingleTonPattern singleTonPattern=new SingleTonPattern();
        SingleTonPattern singleTonPattern = SingleTonPattern.getObj();
        SingleTonPattern.getObj();
        SingleTonPattern.getObj();
        SingleTonPattern.getObj();
        System.out.println(SingleTonPattern.sum);

    }
}
