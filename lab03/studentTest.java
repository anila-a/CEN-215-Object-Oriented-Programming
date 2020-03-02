package lab3_assignments;

public class studentTest {

	public static void main(String[] args) {
		// Student Jack = new Student("Jack", 76, 54, 89, 76, 98);
		student[] students = {
				new student("Jack", new int[] {76, 54, 89, 76, 98}),
				new student("Robert", new int[] {34, 65, 23, 87, 100}),
				new student("Edward", new int[] {80, 65, 97, 54, 94}),
			    new student("Eddie", new int[] {63, 75, 33, 75, 87})
				};
		
		// Student[] students = new Student[] {Jack, Robert, Edward, Eddie};
		System.out.println("Name\t " + "Grade1\t" + "Grade2\t" + "Grade3\t" + "Grade4\t" + "Grade5\t" + "Average");
		for(student i: students) {
			i.printStudent();
		}
		sortStudents(students);
		System.out.println();

		System.out.println("Name\t " + "Grade1\t" + "Grade2\t" + "Grade3\t" + "Grade4\t" + "Grade5\t" + "Sorted average");
		for(student i: students) {
			i.printStudent();
		}
	}

	public static void sortStudents(student[] students) {
		student tmp;
		for(int i = 0; i < students.length-1; i++) {
			for(int j = i+1; j < students.length; j++) {
				if(students[i].getAvg() < students[j].getAvg()) {
					tmp = students[i];
					students[i] = students[j];
					students[j] = tmp;
				}
			}
		}
	}
}

