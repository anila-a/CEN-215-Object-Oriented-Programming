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
