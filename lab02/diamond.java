/* Write a code with nested loops to display the
following pattern: */

package lab2_assignment;

public class diamond {

	public static void main(String[] args) {
		int i, j, k;
		int n = 9; int a = 1;
		int s = n - 1;
		
		while(s != 0) {
			System.out.print("  ");
			s--;
		}
		System.out.println(a);
		s = n - 2;
		for(i = 1; i < n; i++) {
			a = 1;
			for(k = 1; k <= s; k++) {
				System.out.print("  ");
			}
			for(j = 0; j <= i*2; j++) {
				if(j < i) {
					System.out.print(a + " ");
					a++;
				} else {
					System.out.print(a + " ");
					a--;
				}
			}
			System.out.println();
			s--;
		}
		for(i = n-1; i >= 1; i--) {
			s = n - i;
			a = 1;
		}
		for(k = 1; k <= s; k++) {
			System.out.print(" ");
		}
		for(j = 1; j <= i*2-1; j++) {
			if(j < i) {
				System.out.print(a);
				a++;
			} else {
				System.out.print(a);
				a--;
			}
		}
		System.out.println();
		s--;
	}
}

