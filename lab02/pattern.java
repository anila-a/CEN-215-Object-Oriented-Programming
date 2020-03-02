/* Write a method to display a pattern as
follows: */

package lab2_assignment;

import java.util.Scanner;

public class pattern {

	public static void 	main(String[] args) {
		System.out.println("Enter a number: ");
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();

		displayPattern(a);
	}
	
	private static void displayPattern(int a) {
		for(int i = 1; i <= a; i++) {
			for(int k = a - i; k > 0; k--) {
				for(int x = (int)Math.log10(k) + 1; x >= 0; x--) {
					System.out.print(" "); 
				}
			}
			for(int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

