package lab5;

public class Student extends Person {
	
	private final String status;

	public Student(String name, String address, String phone, String email, String status) {
		super(name, address, phone, email);
		this.status = status;
	}

	public Student(String name, String status) {
		super(name);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
	
}
