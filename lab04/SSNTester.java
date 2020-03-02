package lab4_assignment;
import java.util.Scanner;

public class SSNTester {
	public static void main(String[] args) {
		System.out.println("Enter a SSN number: ");
		Scanner in = new Scanner(System.in);
		String ssn = in.next();
		SSN ch = new SSN();
		if(ch.checkSSN(ssn)) {
			System.out.println("Valid SSN");
		}
		else {
			System.out.println("Invalid SSN");
		}
	}
}
