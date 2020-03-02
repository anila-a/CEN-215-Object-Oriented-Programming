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
