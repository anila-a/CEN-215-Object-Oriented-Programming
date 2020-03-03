package hw2;

import java.util.Date;

public class Account {
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	private Date dateCreated = new java.util.Date();
	
	public Account(int i, double b, double a) {
		this.id = i;
		this.balance = b;
		this.annualInterestRate = a;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		double monthlyInterestRate = (this.annualInterestRate / 100) / 12;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest(double monthlyInterestRate) {
		return this.balance * monthlyInterestRate;
	}
	
	public double withdraw(double amount) {
		this.balance -= amount;
		return this.balance;
	}
	
	public double deposit(double amount) {
		this.balance += amount;
		return this.balance;
	}
}
