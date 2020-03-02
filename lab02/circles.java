/* Write a program that prompts the user to enter the
center coordinates and radii of two circles and determines whether the second
circle is inside the first or overlaps with the first. */

package lab2_assignment;
import java.util.Scanner;
import java.math.*;

public class circles {

	public static void main(String[] args) {
		System.out.println("Enter the radii of circle 1: ");
		Scanner sc1 = new Scanner(System.in);
		double rad1 = sc1.nextDouble();
		
		System.out.println("Enter the center coordinates of circle1 (x,y): ");
		Scanner sc2 = new Scanner(System.in);
		double x1 = sc2.nextDouble();
		Scanner sc3 = new Scanner(System.in);
		double y1 = sc3.nextDouble();
		
		System.out.println("Enter the radii of circle 2: ");
		Scanner sc4 = new Scanner(System.in);
		double rad2 = sc4.nextDouble();
		
		System.out.println("Enter the center coordinates of circle 2 (x,y): ");
		Scanner sc5 = new Scanner(System.in);
		double x2 = sc5.nextDouble();
		Scanner sc6 = new Scanner(System.in);
		double y2 = sc6.nextDouble();
		
		System.out.println(check(rad1, rad2, x1, y1, x2, y2));
	}
	
	private static String check(double rad1, double rad2, double x1, double y1, double x2, double y2) {
		double distance = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0)); 
		if(distance <= Math.abs(rad1 - rad2)) {
			return "Inside";
		}
		else if(distance <= Math.abs(rad1 + rad2)) {
			return "Overlaps";
		}
		return "Do not overlap and outside";
	}
}
