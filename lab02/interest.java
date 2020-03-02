/* If you know the balance and the annual percentage interest rate, 
you can compute the interest on the next monthly pay- ment using the following formula:

interest = balance * (annualInterestRate / 1200)

Write a program that reads the balance and the annual percentage interest rate
and displays the interest for the next month. */

package lab2_assignment;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		System.out.println("Enter balance: ");
		Scanner sc1 = new Scanner(System.in);
		double balance = sc1.nextDouble();
		
		System.out.println("Enter annual interest rate: ");
		Scanner sc2 = new Scanner(System.in);
		double annualInterestRate = sc2.nextDouble();
		
		System.out.println("Interest on the next monthly payment: " + calculateInterest(balance, annualInterestRate));
	}

	private static double calculateInterest(double balance, double annualInterestRate) {
		return balance * (annualInterestRate / 1200);
	}
}
