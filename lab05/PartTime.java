package lab5;

public class PartTime extends Students {
	
	private final double creditHrs = 0;
	
	public PartTime(String name, boolean status) {
		super(name, status);
	}
	
	public double TuitionFees(double creditHrs) {
		return creditHrs * 200;
	}
	
}
