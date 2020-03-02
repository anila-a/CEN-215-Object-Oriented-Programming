/* Write a program that displays the area and
perimeter of a circle that has a radius of 5.5. */

package lab2_assignment;
import java.lang.Math;

public class areaAndPerimeter {

	public static void main(String[] args) {
		double rad = 5.5;

		System.out.println("Perimeter: " + perimeter(rad));
		System.out.println("Area: " + area(rad));
	}
	
	public static double perimeter(double rad) {
		return 2 * rad * Math.PI;
	}
	
	public static double area(double rad) {
		return rad * rad * Math.PI;
	}
}
