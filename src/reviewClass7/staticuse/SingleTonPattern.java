package reviewClass7.staticuse;

public class SingleTonPattern {

    static int sum=0;
    private SingleTonPattern(){
       sum++;
    }

    static SingleTonPattern getObj(){
        SingleTonPattern singleTonPattern=new SingleTonPattern();
        return  singleTonPattern;
    }

}
