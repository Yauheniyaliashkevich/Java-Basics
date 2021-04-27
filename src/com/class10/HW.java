package com.class10;

public class HW {
	public static void main(String[] args) {
		
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		
		String [] car= new String [5];
		car[0]="BMW";
		car[1]="Mers";
		car[2]="Jeep";
		car[3]="Toyota";
		car[4]="Audi";
		
		//String [] car= {"BMW", "Mers", "Jeep", "Toyota", "Audi" };
		
		for (int i=0; i<car.length; i++) {
			System.out.print(car[i]+" ");
		}
		
		System.out.println();
		System.out.println("-------- 2 way ---------");
		
		for (String c:car) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		System.out.println("-------------- 2 Task -----------");
		
		/*
		 * Create an array of animals and store 6 elements into it.
		 *  Using 2 different loops print all elements from the array.
		 * 
		 */
		
		String [] animals=new String [3];
		
		animals[0]="Zebra";
		animals[1]="Dog";
		animals[2]="Cat";
		
		//String [] animals= { "Zebra", "Dog", "Cat" };
		
		for (int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		System.out.println();
		System.out.println("-------------- 2 way --------");
		
		for (String a:animals) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("-------------- 3 Task -----------");
		
		/*
		 * Create an array on integers and calculate the sum of all elements in an array.
		 */
		
		int sum=0;
		int sum1=0;
		int [] numbers=new int [3];
		
		numbers[0]=2;
		numbers[1]=3;
		numbers[2]=8;
		
	    //int [] numbers={2,3,8};
		
		System.out.println(numbers[0]+numbers[1]+numbers[2]);
		
		//for (int i=0; i<numbers.length; i++) {
			//sum=numbers[i];
			//sum1=sum+numbers[i];
		//}
		//System.out.println(sum1);
	}

}
