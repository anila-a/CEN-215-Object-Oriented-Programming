
public class Square extends Rectangle {
	protected double side;
	
	public Square() {

	}
	
	public Square(double side) {
		this.side = side;
	}

	public Square(String color, boolean filled, double width, double length, double side) {
		super(color, filled, width, length);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
}
