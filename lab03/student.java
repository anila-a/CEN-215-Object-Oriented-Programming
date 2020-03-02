/* Create Student class and Student objects for the following data:

1-Create a method which returns average of the student.
public int getAverage()
2-Create a method that prints Student information
public void printStudent()
Output: Name Grade1 Grade2 Grade3 Grade4 Grade5 Average
3-Create a method outside the class which sorts all the student objects according to the average
public static void sort(Student[] students) */

package lab3_assignments;
	
public class student {
	String name;
	int[] grades;
	
	public student(String name, int[] grades) {
		this.name = name;
		this.grades = grades;
	}
	// public Student(String name, int... grades) { 
		// this.name = name;
		// this.grades = grades;
	// }
	public double getAvg() {
		int sum = 0; 
		for(int i : grades) {
			sum += i;
		}
		return (double) sum / grades.length;
	}
	public void printStudent() {
		System.out.print(name + "\t ");
		for(int i: grades) {
			System.out.print(i + "\t");
		}
		System.out.println(this.getAvg());
	}
}
