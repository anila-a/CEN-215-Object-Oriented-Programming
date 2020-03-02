package lab4_assignment;

import java.util.Scanner;

public class OccurrencesTester {

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		Occurrences input = new Occurrences(str);
		input.OccurrencesCount(str);
	}

}
