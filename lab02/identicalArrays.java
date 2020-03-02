/* The arrays list1 and list2 are strictly identical if their corresponding elements are equal.
Write a method that returns true if list1 and list2 are strictly identical, using the following header:

public static boolean equals(int[] list1, int[] list2)

Write a test program that prompts the user to enter two lists of integers and displays 
whether the two are strictly identical. */

package lab2_assignment;
import java.util.Scanner;

public class identicalArrays {

	public static void main(String[] args) {
		
		System.out.println("Enter list1: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] list1 = new int[x];
		for(int i = 0; i < x; i++) {
			Scanner Sc = new Scanner(System.in);
			int y = Sc.nextInt();
			list1[i] = y;
		}
		
		System.out.println("Enter list2: ");
		Scanner mc = new Scanner(System.in);
		int a = mc.nextInt();
		int[] list2 = new int[a];
		for(int i = 0; i < a; i++) {
			Scanner nc = new Scanner(System.in);
			int b = nc.nextInt();
			list2[i] = b;
		}
		if(equals(list1, list2) == false) {
			System.out.println("Not identical.");
		}
		else {
			System.out.println("Identical.");
		}
	}
	public static boolean equals(int[] list1, int[] list2) {
		int i;
		
		if(list1.length != list2.length) { // if the lists are not of the same length, return false
			return false;
		}
		else {
			for(i = 0; i < list1.length; i++) { 
				if(list1[i] == list2[i]) continue; // compare the elements one by one
				else break;
			}
		}
		if(i == list1.length - 1) return true; // if the checking is complete, return true 
		return false; // if not, that means the lists had at least 1 different element, return false
	}
}
