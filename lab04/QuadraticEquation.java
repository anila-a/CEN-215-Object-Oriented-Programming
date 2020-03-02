package lab4_assignment;

public class QuadraticEquation {
	private double a, b, c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getDiscriminant(double a, double b, double c) {
		double discriminant = (b * b) - (4 * a * c);
		return discriminant; 
	}
	public double getRoot1(double a, double b, double c, double discriminant) {
		if(discriminant < 0) return 0;
		
		return (-b + Math.sqrt(discriminant)) / 2 * a;
	}
	public double getRoot2(double a, double b, double c, double discriminant) {
		if(discriminant < 0) return 0;
		
		return (-b - Math.sqrt(discriminant)) / 2 * a;
	}
}
