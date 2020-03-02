package lab4_assignment;

import java.util.Scanner;

public class BinaryToDecimalTester {

	public static void main(String[] args) {
		System.out.println("Enter the binary number: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		BinaryToDecimal input = new BinaryToDecimal(str);
		System.out.println(input.BinaryToDecimalConversion());
	}

}
