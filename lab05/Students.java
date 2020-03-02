package lab5;

public class Students {
	
	String name;
	boolean status = true; // true for full-time and false for part-time
	
	public Students(String name, boolean status) {
		super();
		this.name = name;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String toString() {
		return "" + this.getClass().getName() + ": " + name + "";
 	}

}
