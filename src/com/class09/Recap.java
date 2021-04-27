package com.class09;

public class Recap {
      public static void main(String[] args) {
		
		for (int i = 1; i<4;i++) {
			for (int j=1; j<5; j++) {
				System.out.println("Good");
			}
			System.out.println("-------");
		}
		
		System.out.println("----------");
		
		for (int i = 5; i<7;i++) {
			System.out.println("Outer loop");
			for (int j=10; j<=12; j++) {
				System.out.println("Inner loop");
			}
			System.out.println("-------");
		}
		
System.out.println("----------");
		
		for (int i = 1; i<3;i++) {
			System.out.println(i);
			for (int j=1; j<=4; j++) {
				System.out.println(j);
			}
			System.out.println("-------");
		}
		
		
System.out.println("--------------------------");
		
		for (int i = 1; i<3;i++) {
			
			for (int j=1; j<=4; j++) {
				System.out.println(i+" "+j);
			}
		}
			System.out.println("----------print numbers from 10 to 99 using nested loop----------------");
			
			
			for (int a = 0; a<10 ;a++) {
				
				for (int j=0; j<=9; j++) {
					System.out.println(a+" "+j);
				}
			}
			
			System.out.println("------------car ");
			
			for(int a=0; a<10; a++) {
				
				for(int b=0; b<10; b++) {
					
					for(int c=0; c<10; c++) {
						
						for(int d=0; d<10; d++) {
							
							System.out.println(a+""+b+""+c+""+d);
						}
					}		
				}
				
			}
			
			
			System.out.println("---------clock 1 way -----------");
			
			for (int a=0; a<=2; a++) {
				for (int b=0; b<=3; b++) {
					for (int c=0; c<=5; c++) {
						for (int d=0;d<=9; d++) {
							System.out.println(a+" "+b+":"+c+" "+d);
						}
					}
				}
			}
			
			System.out.println("---------clock 2 way ----------");
			for (int h=0; h<24; h++) {
				
				for (int m=0; m<60; m++) {
					
					if (h<10 && m<10) {
						System.out.println("0"+h+":0"+m);
					}else if (h<10 && m>=10){
						System.out.println("0"+h+":"+m);
					}else if (h>=10 && m<10){	
						System.out.println(h+":0"+m);
					}else {
						System.out.println(h+":"+m);
					}
				}
			}
			
			System.out.println("-----------------clock 3 way-------");
			
           for (int h=0; h<24; h++) {
				
				for (int m=0; m<60; m++) {
					
					
					if(h<10) {
						
						if (m<10) {
							System.out.println("0"+h+":0"+m);
						}
						System.out.println("0"+h+":"+m);
						
						
						
					}else {
						
						if(m<10) {
							System.out.println(h+":0"+m);
						}else {
							System.out.println(h+":"+m);
						}
					}
					
					System.out.println("-----------------Multiplication Table-------");
					
					int r;
					for (int n=1; n<11; n++) {
						for (int nn=1; nn<11; nn++) {
							r=n*nn;
							System.out.println(n+"*"+nn+"="+r);
						}
					}
					
					
					
                }	
           }	
		
	}

}
