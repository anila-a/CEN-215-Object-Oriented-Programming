package lab5;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate date;
	
	public Employee(String name, String address, String phone, String email, String office, double salary,
			MyDate date) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.date = date;
	}

	public Employee(String name, String office, double salary, MyDate date) {
		super(name);
		this.office = office;
		this.salary = salary;
		this.date = date;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDate() {
		return date;
	}
	
	
}
