/* Write two overloaded methods that return the average of an array with the following headers:

public static int average(int[] array)
public static double average(double[] array)

Write a test program that prompts the user to enter ten double
values, invokes this method, and displays the average value. */

package lab2_assignment;

public class averageArray {

	public static void main(String[] args) {
		double[] arr = {5, 3, 7, 2, 13, 23, 6, 20, 7, 19};
		
		System.out.println(average(arr));
	}
	private static double average(double[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum / arr.length;
	}
}
