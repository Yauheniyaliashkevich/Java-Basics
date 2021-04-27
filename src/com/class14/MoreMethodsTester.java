package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		MoreMethodsExamples moreMethodsExamples=new MoreMethodsExamples();
		
		System.out.println(moreMethodsExamples.print());
		System.out.println(moreMethodsExamples.doubleTheValue(10));
		moreMethodsExamples.isRaining(true);
	    //System.out.println(moreMethodsExamples.isRaining(true););
	    // error because we not returning any
		
		moreMethodsExamples.batch();
		System.out.println(moreMethodsExamples.num(12, 34));
		moreMethodsExamples.even(23);
		
		double [] arr= {10.3,23.4};
	    System.out.println(moreMethodsExamples.array1(arr));
	    
	    //String word="ABC";
	    //System.out.println(moreMethodsExamples.mirror("ANC"));
	    
	    
	    System.out.println(moreMethodsExamples.isMirror("aba"));
	    System.out.println(moreMethodsExamples.isMirror("abcdef"));
	}

}
