package lab4_assignment;
import java.util.Scanner;

public class QuadraticEquationTester {

	public static void main(String[] args) {
		System.out.println("Enter the values a, b, c: ");
		// For a
		Scanner inA = new Scanner(System.in);
		double a = inA.nextDouble();
		// For b
		Scanner inB = new Scanner(System.in);
		double b = inB.nextDouble();
		// For c
		Scanner inC = new Scanner(System.in);
		double c = inC.nextDouble();
		
		QuadraticEquation qe = new QuadraticEquation(a, b, c);
		double discriminant = qe.getDiscriminant(a, b, c);
		if(qe.getDiscriminant(a, b, c) < 0)
			System.out.println("The equation has no roots.");
		else if(qe.getDiscriminant(a, b, c) == 0)
			System.out.println(qe.getRoot1(a, b, c, discriminant));
		else {
			System.out.println(qe.getRoot1(a, b, c, discriminant));
			System.out.println(qe.getRoot2(a, b, c, discriminant));
		}
	}

}
