package lab5;

public class Faculty extends Employee {
	private int hours;
	private String rank;
	
	public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate date,
			int hours, String rank) {
		super(name, address, phone, email, office, salary, date);
		this.hours = hours;
		this.rank = rank;
	}
	
	public Faculty(String name, String office, double salary, MyDate date, int hours, String rank) {
		super(name, office, salary, date);
		this.hours = hours;
		this.rank = rank;
	}

	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	
	
}
