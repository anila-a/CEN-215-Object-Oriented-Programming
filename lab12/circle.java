package lab12;

public class circle extends shape{
    double r;

	public circle(double r) {
		this.r = r;
	}

	double getPerimeter() {
		return 2*r*Math.PI;
	} 
}
