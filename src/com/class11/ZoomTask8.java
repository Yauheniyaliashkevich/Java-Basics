package com.class11;

public class ZoomTask8 {
	public static void main(String[] args) {
		
		
		/*
		 * Maximum and minimum number in the array?
		 */
		
    int[] inputArray={333332,564,7894,15216,41161,5151};
    
    int minValue=inputArray[0];
    int maxValue = inputArray[0];
    
		    for(int i=1;i < inputArray.length; i++){
		    	
		      if(inputArray[i] < minValue){
		    	  minValue = inputArray[i]; 
		      }  
	
		      if(inputArray[i] > maxValue){
		        maxValue = inputArray[i];
		       }
		      }
	  			
		    System.out.println("Maximum value in the array is: " +maxValue);
 		  
			System.out.println("Minimum value in the array is: " +minValue);
		
		
		
		
	}

	}
