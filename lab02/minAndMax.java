/* Write two functions that get undetermined number of parameters 
to find the minimum or the maximum

public static int max(int... n)
public static int min(int... n)

Write a test program that displays the maximum and the
minimum of a sequence of numbers. */

package lab2_assignment;

public class minAndMax {

	public static void main(String[] args) {
		System.out.println("The maximum is " + max(5, 6, 8));
		System.out.println("The maximum is " + max(15, 16, 17, 19, 15, 12, 2, 8, 12));
		System.out.println("The maximum is " + max(5, 6, 8, 5, 8, 9, 6, 7));
		System.out.println();
		System.out.println("The minimum is " + min(5, 6, 8));
		System.out.println("The minimum is " + min(15, 16, 17, 19, 15, 12, 2, 8, 12));
		System.out.println("The minimum is " + min(5, 6, 8, 5, 8, 9, 6, 7));
	}
	
	public static int max(int... a) {
		int max = a[0];
		for(int i: a) if(i > max) max = i;
		
		return max;
	}
	
	public static int min(int... a) {
		int min = a[0];
		for(int i: a) if(i < min) min = i;

		return min;
	}
}
