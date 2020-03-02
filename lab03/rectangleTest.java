/* Design a class named Rectangle to represent a rectangle. The class contains:
1-Two double data fields named width and height that specify the width and height of the rectangle. The default
values are 1 for both width and height .
2-A no-arg constructor that creates a default rectangle.
3-A constructor that creates a rectangle with the specified width and height .
4-A method named getArea() that returns the area of this rectangle.
5-A method named getPerimeter() that returns the perimeter.

Implement the class. Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the
other with width 3.5 and height 35.9 . Display the width, height, area, and perimeter of each rectangle in this order. */

package lab3_assignments;

public class rectangleTest {
	public static void main(String[] args) {
		rectangle object1 = new rectangle(4, 40);
		rectangle object2 = new rectangle(3.5, 35.9);
		
		System.out.println("The perimeter of object1 with width " + object1.width
				+ "and height " + object1.height + " is " + object1.getPerimeter());
		System.out.println("The area of object1 with width " + object1.width
				+ "and height " + object1.height + " is " + object1.getArea());
		
		System.out.println("The perimeter of object2 with width " + object2.width
				+ "and height " + object2.height + " is " + object2.getPerimeter());
		System.out.println("The area of object2 with width " + object2.width
				+ "and height " + object2.height + " is " + object2.getArea());
	}
}
