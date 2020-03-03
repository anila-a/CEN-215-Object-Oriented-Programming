/* Create a static method PerimeterEqual(obj1,obj2) that checks if the perimeter of two
Shape objects are the same. */

package lab12;

public class testPerimeter {
    public static void main(String[] args) {
    	rectangle rectangle = new rectangle(2, 3);
    	circle circle = new circle(2);
    	System.out.println("Same area? " + PerimeterEqual(rectangle, circle));
	}
    public static <E extends shape> boolean PerimeterEqual(E object1, E object2) {
        return object1.getPerimeter() == object2.getPerimeter();
    }
}

