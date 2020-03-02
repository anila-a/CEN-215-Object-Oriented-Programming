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
