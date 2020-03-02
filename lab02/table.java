/* Write a program that displays the following table:
a b pow(a, b)
1 2 1
2 3 8
3 4 81
4 5 1024 */

package lab2_assignment;
import java.lang.Math;

public class table {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		System.out.println("a " + "b " + "pow(a, b)");
		
		for(int i = 0; i < 4; i++) {
			System.out.println(a + " " + b + " " + Math.pow(a, b));
			a++; b++;
		}
	}
}
