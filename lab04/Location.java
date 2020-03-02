package lab4_assignment;

//import java.util.Scanner;

public class Location {
	int row;
	int column;
	int maxValue;
	int arr[][] = new int[row][column];
	
	public Location(int row, int column, int maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	public Location(int[][] arr) {

	}
	public Location locateLargest(int arr[][]) {
		int currentMaxValue = 0;
		int rowIndex = 0, columnIndex = 0;
		for(int i = 0; i < this.row; i++) {
			for(int j = 0; j < this.column; j++) {
				if(arr[i][j] > maxValue) {
					maxValue = arr[i][j];
					rowIndex = i; columnIndex = j;
				}
			}
		}
		return new Location(rowIndex, columnIndex, currentMaxValue);
	}
	// Main function
	public static void main(String[] args) {
		//System.out.println("Enter 2D array size: ");
		//Scanner sc = new Scanner(System.in);
		//int rows = sc.nextInt();
		//int columns = sc.nextInt();
		
		//System.out.println("Enter array elements: ");
		//int arr[][] = new int[rows][columns];
		
		//for(int i = 0; i < rows; i++) {
			//for(int j = 0; j < columns; j++) {
				//arr[i][j] = sc.nextInt();
			//}
		//}
		
		int arr[][] = { { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 } }; 
		
		Location l = new Location(arr);
		System.out.println(l.locateLargest(arr));
	}

}
