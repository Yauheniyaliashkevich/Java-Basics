package com.class34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {
     /*
      How would handle InputMismatchException?
      Input Mismatch Exception when user enters
       mismatch value then programmer expected.
       */
     public static void main(String[] args) {

         System.out.println("Enter the numbers");
         Scanner scanner=null;
         while(true) {
             try {
                 scanner=new Scanner(System.in);
                 int x = scanner.nextInt();
                 System.out.println(x);
                 break;
             } catch (InputMismatchException e) {
                 System.out.println("Wrong input, Enter the numbers");
             }
         }

         //throw new NullPointerException();





     }

}
