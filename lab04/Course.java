package lab4_assignment;

public class Course {
	String courseName;
	String[] students;
	int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
		students = new String[5];
		numberOfStudents = 0;
	}
	public String getCourseName() {
		return courseName;
	}
	public String[] getStudents() {
		String[] arr = new String[numberOfStudents];
		for(int i = 0; i < numberOfStudents; i++)
			arr[i] = students[i];
		return arr;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void addStudent(String student) {
		if(numberOfStudents >= students.length) {
			// Create new array double the size of the first one
			String[] arr = new String[students.length*2];
			for(int i = 0; i < numberOfStudents; i++) 
				arr[i] = students[i];
			students = arr;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public void dropStudent(String student) {
		int i;
		for(i=0; i<numberOfStudents; i++)
			if(student.equals(students[i])) break;
		if(i!=numberOfStudents) {
			for(;i<numberOfStudents-1; i++)
				students[i] = students[i + 1];
			numberOfStudents--;
		} else
			System.err.println("The student " + student + " does not exist.");
	}
	public void clear() {
		students = new String[5];
		numberOfStudents = 0;
	}
}
