package lab12;

public class rectangle extends shape{
    double h;
    double w;
	public rectangle(double h, double w) {
		this.h = h;
		this.w = w;
	}

	double getPerimeter() {
		return w*h;
	}
    
}
