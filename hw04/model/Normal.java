package model;

public class Normal extends User implements Checker {
	private double balance;

	public Normal(String userID, String PIN, String name, String surname, double balance) {
		super(userID, PIN, name, surname);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public boolean checkUser(String userID, String PIN) {
		return userID.equals(this.getUserID()) && PIN.equals(this.getPIN());	
	}
	
	public void withdraw(double value) {
		this.balance -= value;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}

	@Override
	public String toString() {
		return "Normal [balance = " + balance + "]";	
	}
}
