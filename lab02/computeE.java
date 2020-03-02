/* You can approximate e using the following series:
Write a program that displays the e value for i = 10000, 20000, ..., and 100000.*/

package lab2_assignment;
import java.util.Scanner;

public class computeE {

	public static void main(String[] args) {
		System.out.println("Enter the value of i: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		double e = 0; int j = 0;
		for(int k = 0; k <= i; k++) {
			e += 1 / (double)calculateFactorial(j);
			j++;
		}
		System.out.println("The value of e for i = " + i + " is " + e);
	}

	private static int calculateFactorial(int j) {
		int fact = 1;
		
		for(int k = 1; k <= j; k++) {
			fact *= k;
		}
		return fact;
	}
}
