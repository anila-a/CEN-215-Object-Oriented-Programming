package lab4_assignment;

import lab4_assignment.Course;

public class CourseTester {
	public static void main(String[] args) {
		Course cs = new Course("Object Oriented Programming");
		cs.addStudent("Student 1");
		cs.addStudent("Student 2");
		cs.addStudent("Student 3");
		cs.addStudent("Student 4");
		cs.addStudent("Student 5");
		cs.addStudent("Student 6");
		cs.addStudent("Student 7");
		cs.addStudent("Student 8");
		
		for(String i: cs.getStudents())
			System.out.println("Name: " + i);
		
		System.out.println("=====Dropping=====");
		cs.dropStudent("Student 3");
		cs.dropStudent("Student 9");
		for(String i: cs.getStudents())
			System.out.println("Name: " + i);
	}
}
