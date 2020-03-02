/* Write a program that meets the following requirements:
1-Creates an array with 100 randomly chosen integers.
2-Prompts the user to enter the index of the array, then displays the corresponding element value. 
If the specified index is out of bounds, display the message Out of Bounds. */

import java.util.*;

import javax.swing.JOptionPane;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i = 0; i < 100; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		Scanner input = new Scanner(System.in);
		boolean c = true;
		do {
			try {
				System.out.println("Enter index: ");
				int index = input.nextInt();
				System.out.println(arr[index]);
				c = false;
			} catch(ArrayIndexOutOfBoundsException ex) {
				System.err.println("Index not valid.");
			} catch(InputMismatchException e) {
				System.err.println("Not and integer.");
				input.nextLine(); //heq inputin
				//JOptionPane.showMessageDialog(null, "Not integer", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while(c);	
	} 
	
}
