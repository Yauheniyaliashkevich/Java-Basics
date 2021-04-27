package Repl;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] nums={input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        /*for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==5&&nums[i+1]==5){
                System.out.println(true);
                break;
            }else{
                System.out.println(false);
            }
        }*/

        int a= nums[0];
        int count=0;

        for (int i = 1; i < nums.length; i++) {
            if( a==5 && nums[i]==5){
                a=nums[i];
                count++;
            }else{
                a=nums[i];
            }

        }

        if(count>=1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
