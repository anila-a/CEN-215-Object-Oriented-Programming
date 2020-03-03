package model;

public class Person extends User implements Checker {
	private String name, address;
	private MyDate bd;
	public Person(String user, String pass, String name, String address, MyDate bd) {
		super(user, pass);
		this.name = name;
		this.address = address;
		this.bd = bd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public MyDate getBd() {
		return bd;
	}
	public void setBd(MyDate bd) {
		this.bd = bd;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", bd=" + bd + "]";
	}
	@Override
	public boolean checkUser(String user, String pass) {
		return user.equals(this.getUser())&&pass.equals(this.getPass());
	}
	
}
