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
