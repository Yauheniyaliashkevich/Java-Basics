package com.class34;

public class Demo400 {
    public static void main(String[] args) {
        try{
            /*System.out.println(10/0);
            System.out.println("First issue");
            String name= null;
            System.out.println(name.length());
            int arr[] ={10,20};
            System.out.println(arr[5]);
            System.out.println(arr[-1]);
            int [] arr2= new int[-1];*/

            String var2= "abs";
            var2.charAt(10);
        }catch(NullPointerException e){
            System.out.println("Can not call methods on a null object");
        } catch (ArithmeticException arithmeticException){
            System.out.println("Can not devide by zero please contact Saleem");
        } catch (Exception e){
            System.out.println("To handle any other error");
        }
        /*catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Out of bound please contact Azizi");
        }*/
    }
}
