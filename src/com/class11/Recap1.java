package com.class11;

public class Recap1 {
public static void main(String[] args) {
	
	int [] nums= {10,12,14,44,23,78};
	int total=nums.length;
	
	for (int i=0; i<nums.length; i++) {
		System.out.print(nums[1]+" ");
	}
	
	System.out.println();
	System.out.println("----------------------");
	
	for (int i=nums.length-1; i>=0;i--) {
		System.out.print(nums[i]+" ");
		
	}
	
	System.out.println();
	System.out.println("----------------------");
	
	for(int num:nums) {
		System.out.print(num+" ");
	}// this loop never gets indexOutOfBound --> it always starts from the beginning of the array and stops at the end
	
	
	
	
}

}
