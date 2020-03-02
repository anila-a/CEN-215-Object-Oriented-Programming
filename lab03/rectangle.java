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

public class rectangle {
	double width = 1.0, height = 1.0;
	
	rectangle() {}
	rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
