package reviewClass6;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        //stringBuilder.append(" Batch 9").delete(0,5);
        //stringBuilder.append(" Batch 9").deleteCharAt(0);
        //stringBuilder.append(" Batch 9").insert(stringBuilder.length(),"Bye");
        stringBuilder.append("  How are you Jack");
        stringBuilder.insert(stringBuilder.indexOf("you")+3," bye");
        System.out.println(stringBuilder.indexOf("you"));

        System.out.println(stringBuilder);

        String string=new String("Hello");
        string=string.concat(" Batch 9");
        System.out.println(string);


        StringBuffer stringBuffer = new StringBuffer("I can work in parallel");
        stringBuffer.reverse();
    }
}
