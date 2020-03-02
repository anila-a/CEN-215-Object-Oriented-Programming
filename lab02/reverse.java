/* Write a program that
reads ten integers and displays them in the reverse of the
order in which they were read. */

package lab2_assignment;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int x = 0; x < 10; x++) {
			Scanner sc = new Scanner(System.in);
			int i =  sc.nextInt();
			
			num[x] = i;		
		}
		
		for(int x = 9; x >= 0; x--) {
			System.out.print(num[x]);
		}
	}

}
