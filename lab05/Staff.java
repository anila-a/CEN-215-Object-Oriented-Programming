package lab5;

public class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phone, String email, String office, double salary, MyDate date,
			String title) {
		super(name, address, phone, email, office, salary, date);
		this.title = title;
	}

	public Staff(String name, String office, double salary, MyDate date, String title) {
		super(name, office, salary, date);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
