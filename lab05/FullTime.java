package lab5;

public class FullTime extends Students {
	
	public final double fee = 2000.0;
	
	public FullTime(String name, boolean status) {
		super(name, status);
	}
	
	public double TuitionFees() {
		return fee;
	}

}
