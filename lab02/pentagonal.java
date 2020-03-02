/* A pentagonal number is defined as n(3n–1)/2 for . . ., and so on. 
Therefore, the first few numbers are 1, 5, 12, 22, . . .. 

Write a method with the following header that returns a pentagonal number:

public static int getPentagonalNumber(int n)

Write a test program that uses this method to display the first
100 pentagonal numbers with 10 numbers on each line. */

package lab2_assignment;

public class pentagonal {

	public static void main(String[] args) {
		int n = 1;
		
		for(int i = 0; i < 100; i++) {
			getPentagonalNumber(n);
			System.out.print(getPentagonalNumber(n) + " ");
			n++;
			
			if(n % 11 == 0) {
				System.out.println("");
			}
		}
	}

	private static int getPentagonalNumber(int n) {
		int pentagonal = (n * (3 * n - 1)) / 2;
		
		return pentagonal;
	}
}
