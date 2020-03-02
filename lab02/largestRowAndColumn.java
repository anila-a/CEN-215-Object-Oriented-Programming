/* Write a program that randomly
fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, and
finds the first row and column with the most 1s. */

package lab2_assignment;

public class largestRowAndColumn {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		showMatrix(matrix);
		
		largestRowIndex(matrix);
		largestColumnIndex(matrix);
		
		System.out.println("Largest Row Index: " + largestRowIndex(matrix));
		System.out.println("Largest Column Index: " + largestColumnIndex(matrix));
	}

	private static int largestRowIndex(int[][] matrix) {
		int maxSumR = 0; int indexR = 0;
		
		for(int i = 0; i < 4; i++) {
			int sum = 0;
			for(int j = 0; j < 4; j++) {
				sum += matrix[i][j];
			}
			if(sum > maxSumR) {
				maxSumR = sum;
				indexR = i;
			}
		}
		return indexR;
	}
	
	private static int largestColumnIndex(int[][] matrix) {
		int maxSumC = 0; int indexC = 0;
		
		for(int j = 0; j < 4; j++) {
			int sum = 0;
			for(int i = 0; i < 4; i++) {
				sum += matrix[j][i];
			}
			if(sum > maxSumC) {
				maxSumC = sum;
				indexC = j;
			}
		}
		return indexC;
	}
	
	private static void showMatrix(int[][] matrix) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}

