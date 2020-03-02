package lab5;

public class Person {
	private String name;
	private String address;
	private String phone;
	private String email;
	
	public Person(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		setPhone(phone);
		this.email = email;
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if(phone.matches("(\\d{3}) \\d{2} \\d{3} \\d{2}")) { //(267)23 743 24
			this.phone = phone;	
		} else System.err.println("Phone is not changed!");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "" + this.getClass().getName() + ": " + name + "";
 	}
	

}
