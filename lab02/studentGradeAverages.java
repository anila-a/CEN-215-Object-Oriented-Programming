/* Create respective arrays for the following data:

Grade 1 Grade 2 Grade 3 Grade 4 Grade 5
Jack 76 54 89 76 98
Robert 34 65 23 87 100
Edward 80 65 97 54 94
Eddie 63 75 33 75 87

Create a method which returns an array of integers that will hold the average of each student:

public static int[] calculateAverage(int[][] grades)

Create a method that prints all the arrays in a formatted way:

public static void printStudents(String[] names, int[][] grades, int[] average)

Create another method which sorts all the arrays according to the average:

public static void sort(String[] names, int[][] grades, int[] average) */

package lab2_assignment;
import java.util.Scanner;

public class studentGradeAverages {

	public static void main(String[] args) {
		String[] names = {"Jack", "Robert", "Edward", "Eddie"};
		int[][] grades = {{76, 54, 89, 76, 98},
				{34, 65, 23, 87, 100},
				{80, 65, 97, 54, 94},
				{63, 75, 33, 75, 87}};
		int[] avg = calculateAvg(grades);
		printStudents(names, grades, avg);
		System.out.println();
		System.out.println("===== Sorted averages =====");
		System.out.println();
		sort(names, grades, avg);
		printStudents(names, grades, avg);
		}

	private static void printStudents(String[] names, int[][] grades, int[] avg) {
		System.out.println("\tGrade 1\tGrade 2\tGrade 3\tGrade 4\tGrade 5\tAverage");
		
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			for(int j = 0; j < grades[i].length; j++) {
				System.out.print("\t" + grades[i][j]);
			}
			System.out.println("\t" + avg[i]);
		}
	}

	private static int[] calculateAvg(int[][] grades) {
		int[] avg = new int[grades.length];
		
		for(int i = 0; i < grades.length; i++) {
			int sum = 0;
			for(int j = 0; j < grades[i].length; j++) {
				sum += grades[i][j];
				avg[i] = sum / grades[i].length;
			}
		}
		return avg;
	}
	
	private static void sort(String[] names, int[][] grades, int[] avg) {
		String tempS; int temp; int[] tempA;
		
		for(int i = 0; i < avg.length - 1; i++) {
			for(int j = i+1; j < avg.length; j++) {
				if(avg[i] < avg[j]) {
					temp = avg[i];
					avg[i] = avg[j];
					avg[j] = temp;
					
					// sort names
					tempS = names[i];
					names[i] = names[j];
					names[j] = tempS;
					
					// sort grades
					tempA = grades[i];
					grades[i] = grades[j];
					grades[j] = tempA;
				}
			}
		}
	}
}
