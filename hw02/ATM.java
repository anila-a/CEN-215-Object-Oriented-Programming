package hw2;

public class ATM {
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
		
	public ATM(int i, double b) {
		this.id = i;
		this.balance = b;
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

