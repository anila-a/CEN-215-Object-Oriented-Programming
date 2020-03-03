
public class Circle2 implements GeometricObject {
	protected double rad;

	public Circle2(double rad) {
		this.rad = rad;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.rad;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.rad, 2);
	}
	
}
