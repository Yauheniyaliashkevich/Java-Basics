package com.class11;

public class ZoomTask4 {
	public static void main(String[] args) {
		
		
		
		/* 4.Create 2D array of countries:
		 * north america countries,
		 * south america countries,
		 *  europe countries,
		 *  asian countries,
		 *   african countries.
		 *   Then print all values from that array using 2 different loops
		 *   and calculate how many total countries have been stored.
		 */
		
				String[][] countries = {
						{ "Dominican Republic", "Canada", "Cuba", "Mexica"},
						{ "Brazil", "Argentina", "Colombia","Peru","Chile"},
						{ "Great Britain", "Italy", "Monaco","France","" },
						{ "Nigeria", "Ghana", "Kenya", "Tanzania" }
						};
				
				for (int row = 0; row < countries.length; row++) {
					for (int col = 0; col < countries[row].length; col++) {
						System.out.print(countries[row][col] + " ");
					}
					System.out.println();
					
				}
				
				
				
				
			int count=0;
				
				
				System.out.println("============   Nested For Each Loop  =============");
				for (String[] names : countries) {
					for (String n : names) {
						System.out.print(n+" ");
						count++;
					}
					System.out.println();
				}
		
		int sum= countries[0].length +countries[1].length+countries[2].length
				+countries[3].length;
		
		System.out.println(sum);
		//vchcgchg
		System.out.println(count);
		
		
	}

}
