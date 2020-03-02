package lab4_assignment;

import java.util.Scanner;

public class PasswordTester {
	public static void main(String[] args) {
		System.out.println("Enter a password: ");
		Scanner in = new Scanner(System.in);
		String pass = in.next();
		Password p = new Password();
		if(p.checkPass(pass)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Invalid password");
		}
	}
}
