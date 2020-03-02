package lab5;
import java.util.Scanner;

public class UseStudent {
	public static void main(String[] args) {
		Students[] std = {
				new FullTime("Student 1", true),
				new FullTime("Student 2", true),
				new FullTime("Student 3", true),
				new PartTime("Student 4", false),
				new PartTime("Student 5", false)
		};
		
		for(Students i: std) {
			if(i instanceof FullTime) {
				System.out.println(i.getName() + " | Flat fee: $" + ((FullTime) i).TuitionFees());
			}
		}
		
		Scanner in = new Scanner(System.in);
		
		for(Students i: std) {
			if(i instanceof PartTime) {
				double credit = in.nextInt();
				System.out.println(i.getName() + " | Tuition fee: $" + ((PartTime) i).TuitionFees(credit));
			}
		}
	}
}
