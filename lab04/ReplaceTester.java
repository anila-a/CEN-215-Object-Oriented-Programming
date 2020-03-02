package lab4_assignment;

import java.util.Scanner;

public class ReplaceTester {
		public static String replaceDigits(String str) {
			return str.replaceAll("\\d", "#");
		}
		public static void main(String[] args) {
			System.out.println("Enter a string: ");
		
			Scanner in = new Scanner(System.in);
			String str = in.next();
			System.out.println(replaceDigits(str));
		}
	}
	