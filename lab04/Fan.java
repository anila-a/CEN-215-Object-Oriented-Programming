package lab4_assignment;

public class Fan {
	final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = SLOW;
	private static boolean on = false;
	private double radius = 5;
	String color = "Blue";
	
	public Fan() { }
	public Fan(int speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	public String toString() {
		if(Fan.on == true)
			return speed + " " + color + " " + radius;
		else
			return speed + " " + color + " " + radius + " The fan is off";	
	}

}
