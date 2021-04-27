package Repl;

public class Repl139 {
    public static void main(String[] args) {


        /*if ('e'>'h'){
            System.out.println(true);
        }else{
            System.out.println(false);
        }*/
        String str="hello";
        char a=str.charAt(0);

        System.out.print(a);
        for(int i=1; i<str.length();i++){

            if(str.charAt(i)>a){
                a=str.charAt(i);
                System.out.print( str.charAt(i));

            }
        }





    }

}
